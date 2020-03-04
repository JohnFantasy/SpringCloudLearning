package com.laofaner.commonutils;

import com.alibaba.excel.util.CollectionUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.junit.platform.commons.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * @program: SpringBoot&SpringCloud
 * @description: poi操作excel文档
 * @author: fyz
 * @createAt: 2020-02-18 15:32
 **/
public class ExcelUtils {

    public static final String XLSX = ".xlsx";
    public static final String XLS = ".xls";
    public static final int IMG_HEIGTH = 30; // 图片高度显示像素
    public static final int IMG_WIDTH = 30; // 图片宽度显示像素
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelUtils.class);

    /**
     * Excel导出
     *
     * @param title   导出Excel文件名称
     * @param rowList 第一个List为表头，其余行为表数据
     * @param resp    HttpServletResponse 对象。不要用注入的resp，用controler方法中声明的resp。否则会去寻找jsp
     * @throws IOException
     */
    public static void writeExcel(String title, List<List<Object>> rowList, HttpServletResponse resp) throws IOException {
        if (resp == null) {
            throw new NullPointerException("the HttpServletResponse is null");
        }
        SXSSFWorkbook book = warpSingleWorkbook(title, rowList);
        // 响应客户端
        String filename = new String(title.getBytes("UTF-8"), "ISO-8859-1");
        resp.reset();
        resp.setHeader("Content-disposition", "attachment; filename=" + filename + XLS);
        resp.setContentType("application/vnd.ms-excel;charset=UTF-8");
        // 输出Excel文件
        ServletOutputStream outputStream = resp.getOutputStream();
        book.write(outputStream);
        book.close();
        outputStream.close();
    }

    /**
     * Excel导出设置Workbook
     *
     * @param title   导出Excel文件名称
     * @param rowList 第一个List为表头，其余行为表数据
     * @throws IOException
     */
    public static SXSSFWorkbook warpSingleWorkbook(String title, List<List<Object>> rowList) throws IOException {
        String filename = title;
        if (!StringUtils.isNotBlank(title)) {
            filename = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        }
        if (rowList == null || rowList.isEmpty()) {
            throw new NullPointerException("the row list is null");
        }
        SXSSFWorkbook book = new SXSSFWorkbook();
        // 创建表
        setWorkBookData(book, filename, rowList);
        return book;
    }

    private static void setWorkBookData(SXSSFWorkbook book, String sheetName, List<List<Object>> rowList) {
        Sheet sheet = book.createSheet(sheetName);
        Drawing patriarch = sheet.createDrawingPatriarch();
        // 设置表头样式
        CellStyle style = book.createCellStyle();
        // 设置居左
        style.setAlignment(HorizontalAlignment.LEFT);
        // 检测表头数据（表头不允许数据为空）
        List<Object> head = rowList.get(0);
        for (Object key : head) {
            if (!StringUtils.isNotBlank(key.toString())) {
                throw new NullPointerException("there is a blank exist head row");
            }
        }
        // 写数据
        int size = rowList.get(0).size();
        for (int i = 0; i < rowList.size(); i++) {
            List<Object> row = rowList.get(i);
            if (row == null || row.isEmpty()) {
                throw new NullPointerException("the " + (i + 1) + "th row is null");
            }
            if (size != row.size()) {
                throw new IllegalArgumentException("the cell number of " + (i + 1) + "th row is different form the first");
            }
            Row sr = sheet.createRow(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j) != null && row.get(j) instanceof URL) {
                    URL url = (URL) row.get(j);
                    sr.setHeight((short) (IMG_HEIGTH * IMG_WIDTH));
//                    drawPictureIntoExcel(book, patriarch, i, j, url);
                } else {
                    setExcelValue(sr.createCell(j), row.get(j), style);
                }
            }
        }
    }

    /**
     * 导出多页Excel
     *
     * @param sheetMap key为每个页的名称，value为表头行+数据行
     * @return
     * @throws IOException
     */
    public static SXSSFWorkbook warpSingleWorkbook(Map<String, List<List<Object>>> sheetMap) throws IOException {
        SXSSFWorkbook book = new SXSSFWorkbook();
        for (String key : sheetMap.keySet()) {
            String sheetName = Pattern.compile("[[/*#]]").matcher(key).replaceAll("");
            setWorkBookData(book, sheetName, sheetMap.get(key));
        }
        return book;
    }


    /**
     * Excel导出设置Workbook（表头自动换行）
     *
     * @param title   导出Excel文件名称
     * @param rowList 第一个List为表头，其余行为表数据
     * @throws IOException
     */
    public static SXSSFWorkbook getSingleWorkbook(String title, List<List<Object>> rowList) throws IOException {
        String filename = title;
        if (StringUtils.isBlank(filename)) {
            filename = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        }
        if (rowList == null || rowList.isEmpty()) {
            throw new NullPointerException("the row list is null");
        }
        SXSSFWorkbook book = new SXSSFWorkbook();
        // 创建表
        Sheet sheet = book.createSheet(filename);
        Font headFont = book.createFont();
        Drawing patriarch = sheet.createDrawingPatriarch();
        // 设置表头样式
        XSSFCellStyle style = (XSSFCellStyle) book.createCellStyle();
        CellStyle headStyle = book.createCellStyle();
        // 设置居左
        style.setAlignment(HorizontalAlignment.LEFT);
        headStyle.setAlignment(HorizontalAlignment.CENTER);
        headStyle.setAlignment(HorizontalAlignment.CENTER);// 水平居中
        headStyle.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直居中
        headStyle.setWrapText(true);// 自动换行
        headStyle.setFont(headFont);
        // 检测表头数据（表头不允许数据为空）
        List<Object> head = rowList.get(0);
        Row headRow = sheet.createRow(0);
        for (int i = 0; i < head.size(); i++) {
            if (StringUtils.isBlank(head.get(i).toString())) {
                book.close();
                throw new NullPointerException("there is a blank exist head row");
            }
            setExcelValue(headRow.createCell(i), head.get(i), headStyle);
        }
        // 写数据
        style.setWrapText(true);
        createBodyData(rowList, book, sheet, style, patriarch, false);
        return book;
    }

    /**
     * Excel写网络图片
     *
     * @param wb
     * @param patriarch
     * @param rowIndex
     * @param url
     */
//    private static void drawPictureIntoExcel(SXSSFWorkbook wb, Drawing patriarch, int rowIndex, int cloumIndex, URL url) {
//        // rowIndex代表当前行
//        try (InputStream is = url.openStream(); ByteArrayOutputStream swapStream = new ByteArrayOutputStream();) {
//            byte[] buff = new byte[100];
//            int rc = 0;
//            while ((rc = is.read(buff, 0, 100)) > 0) {
//                swapStream.write(buff, 0, rc);
//            }
//            // 设置图片位置
//            XSSFClientAnchor anchor = new XSSFClientAnchor(0, 0, 0, 0, cloumIndex, rowIndex, cloumIndex + 1, rowIndex + 1);
//            anchor.setAnchorType(ClientAnchor.AnchorType.MOVE_AND_RESIZE);
//            patriarch.createPicture(anchor, wb.addPicture(swapStream.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
//            swapStream.close();
//        } catch (Exception e) {
//            LOGGER.error("图片请求失败：" + url.toString());
//        }
//    }

    /**
     * Excel导出
     *
     * @param title  导出Excel文件名称
     * @param sheets 包含多个模块的sheets也就是多个rowList,rowList 第一个List为表头，其余行为表数据
     *               object 是一个list<Object>
     * @param resp   HttpServletResponse 对象
     * @throws IOException
     */
    public static void writeExcels(String title, List<List<Object>> sheets, HttpServletResponse resp) throws IOException {
        if (resp == null) {
            throw new NullPointerException("the HttpServletResponse is null");
        }
        String filename = title;
        if (StringUtils.isBlank(filename)) {
            filename = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        }
        if (sheets == null || sheets.isEmpty()) {
            throw new NullPointerException("the row list is null");
        }
        // 创建表
        HSSFWorkbook book = wrapMultWorkbook(filename, sheets);
        // 响应客户端
        filename = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
        resp.reset();
        resp.setHeader("Content-disposition", "attachment; filename=" + filename + XLS);
        resp.setContentType("application/vnd.ms-excel;charset=UTF-8");
        // 输出Excel文件
        book.write(resp.getOutputStream());
        book.close();
    }

    /**
     * Excel导出到项目目录下
     *
     * @param title    导出Excel文件名称
     * @param sheets   包含多个模块的sheets也就是多个rowList,rowList 第一个List为表头，其余行为表数据
     *                 object 是一个list<Object>
     * @param filePath
     * @throws IOException
     */
    public static String writeExcelInWeb(String title, List<List<Object>> sheets, String filePath) throws IOException {
        String filename = title;
        if (StringUtils.isBlank(filename)) {
            filename = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        }
        if (sheets == null || sheets.isEmpty()) {
            throw new NullPointerException("the row list is null");
        }
        // 创建表
        String fileName = filename + ".xls";
        HSSFWorkbook book = wrapMultWorkbook(filename, sheets);
        FileOutputStream stream = new FileOutputStream(filePath + "/" + fileName);
        book.write(stream);
        book.close();
        return fileName;
    }

    /**
     * 将数据写入多个Excel sheet中
     *
     * @param title  标题
     * @param sheets sheet
     * @throws IOException
     */
    public static HSSFWorkbook wrapMultWorkbook(String title, List<List<Object>> sheets) throws IOException {
        HSSFWorkbook book = new HSSFWorkbook();
        for (int p = 0; p < sheets.size(); p++) {
            HSSFSheet sheet = book.createSheet(title + "_" + p);
            sheet.setDefaultRowHeightInPoints(15f);
            // 检测表头数据（表头不允许数据为空）
            @SuppressWarnings("unchecked")
            List<String> head = (List<String>) sheets.get(p).get(0);
            for (Object key : head) {
                if (StringUtils.isBlank(key.toString())) {
                    book.close();
                    throw new NullPointerException("there is a blank exist head row");
                }
            }
            // 写数据
            @SuppressWarnings("unchecked")
            List<Object> data = (List<Object>) sheets.get(p).get(0);
            int size = data.size();
            for (int i = 0; i < sheets.get(p).size(); i++) {
                @SuppressWarnings("unchecked")
                List<Object> row = (List<Object>) sheets.get(p).get(i);
                if (row == null || row.isEmpty()) {
                    book.close();
                    throw new NullPointerException("the " + (i + 1) + "th row is null");
                }
                if (size != row.size()) {
                    book.close();
                    throw new IllegalArgumentException("the cell number of " + (i + 1) + "th row is different form the first");
                }
                HSSFRow sr = sheet.createRow(i);
                for (int j = 0; j < row.size(); j++) {
                    if (row.get(j) == null) {
                        sr.createCell(j).setCellValue("");
                    } else {
                        Object value = row.get(j);
                        if (value instanceof Integer) {
                            HSSFCell cell = sr.createCell(j);
                            cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                            cell.setCellValue(Double.valueOf(value.toString()));
                        } else if (value instanceof BigDecimal) {
                            HSSFCell cell = sr.createCell(j);
                            cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                            cell.setCellValue(((BigDecimal) value).setScale(3, RoundingMode.HALF_UP).doubleValue());
                        } else {
                            sr.createCell(j).setCellValue(value.toString());
                        }
                    }
                }
            }
            for (int i = 0; i < head.size(); i++) {
                sheet.autoSizeColumn(i);
            }
        }
        return book;
    }

    /**
     * 设置Excel浮点数可做金额等数据统计
     *
     * @param cell  单元格类
     * @param value 传入的值
     */
    public static void setExcelValue(Cell cell, Object value, CellStyle style) {
        cell.setCellStyle(style);
        // 写数据
        if (value == null) {
            cell.setCellValue("");
        } else {
            if (value instanceof Integer || value instanceof Long) {
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(Long.valueOf(value.toString()));
            } else if (value instanceof BigDecimal) {
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(((BigDecimal) value).setScale(3, RoundingMode.HALF_UP).doubleValue());
            } else {
                cell.setCellValue(value.toString());
            }
        }
    }

    /**
     * 设置Excel表体数据
     *
     * @param rowList 表数据 ： index 为0 为表头
     * @param hasHead 是否包含表头
     */
    public static void createBodyData(List<List<Object>> rowList, SXSSFWorkbook book, Sheet sheet, XSSFCellStyle style, Drawing patriarch, Boolean hasHead) throws IOException {
        int size = rowList.get(0).size();
        int startNum = 1;
        if (hasHead) {
            startNum = 0;
        }
        for (int i = startNum; i < rowList.size(); i++) {
            List<Object> row = rowList.get(i);
            if (row == null || row.isEmpty()) {
                book.close();
                throw new NullPointerException("the " + (i + 1) + "th row is null");
            }
            if (size != row.size()) {
                book.close();
                throw new IllegalArgumentException("the cell number of " + (i + 1) + "th row is different form the first");
            }
            Row sr = sheet.createRow(i);
            for (int j = 0; j < row.size(); j++) {
                if (patriarch != null && row.get(j) != null && row.get(j) instanceof URL) {
                    URL url = (URL) row.get(j);
                    sr.setHeight((short) (IMG_HEIGTH * IMG_WIDTH));
//                    drawPictureIntoExcel(book, patriarch, i, j, url);
                } else {
                    setExcelValue(sr.createCell(j), row.get(j), style);
                }
            }
        }
    }

    /**
     * Excel单行设置值一般用于合并单元格
     *
     * @param row 行对象
     */
    public static void writeSingleRowExcel(Row row, List<Object> rowList, CellStyle style) {
        if (row == null) {
            throw new NullPointerException("the HSSFRow is null");
        }
        if (CollectionUtils.isEmpty(rowList)) {
            return;
        }
        // 设置行数据
        for (int i = 0; i < rowList.size(); i++) {
            setExcelValue(row.createCell(i), rowList.get(i), style);
        }
    }

    /**
     * 将Excel转化为输入流
     *
     * @param book Excel对象
     * @return 输入流
     * @throws IOException
     */
    public static InputStream sxssfWorkbookToInputStream(SXSSFWorkbook book) throws IOException {
        ByteArrayInputStream bais = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        book.write(baos);
        bais = new ByteArrayInputStream(baos.toByteArray());
        baos.close();
        book.close();
        return bais;
    }

    /**
     * Excel导出设置Workbook（包含下载图片）
     *
     * @param title       导出Excel文件名称
     * @param rowList     第一个List为表头，其余行为表数据
     * @param downLoadPic 是否下载图片 （如果要下载图片，图片的信息放Excel维度的第一列）
     * @throws IOException
     */
    public static HSSFWorkbook wrapSingleWorkbook(String title, List<List<Object>> rowList, Boolean downLoadPic) throws IOException {
        String filename = title;
        if (StringUtils.isBlank(title)) {
            filename = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        }
        if (rowList == null || rowList.isEmpty()) {
            throw new NullPointerException("the row list is null");
        }
        HSSFWorkbook book = new HSSFWorkbook();
        // 创建表
        HSSFSheet sheet = book.createSheet(filename);
        // 设置单元格默认宽度为15个字符
        sheet.setDefaultColumnWidth(15);
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
        // 设置表头样式
        HSSFCellStyle style = book.createCellStyle();
        // 设置居左
        style.setAlignment(HorizontalAlignment.LEFT);
        // 这种自动换行
        style.setWrapText(true);
        // 检测表头数据（表头不允许数据为空）
        List<Object> head = rowList.get(0);
        for (Object key : head) {
            if (StringUtils.isBlank(key.toString())) {
                book.close();
                throw new NullPointerException("there is a blank exist head row");
            }
        }
        // 写数据
        int size = rowList.get(0).size();
        for (int i = 0; i < rowList.size(); i++) {
            List<Object> row = rowList.get(i);
            if (row == null || row.isEmpty()) {
                book.close();
                throw new NullPointerException("the " + (i + 1) + "th row is null");
            }
            if (size != row.size()) {
                book.close();
                throw new IllegalArgumentException("the cell number of " + (i + 1) + "th row is different form the first");
            }
            HSSFRow sr = sheet.createRow(i);
            for (int j = 0; j < row.size(); j++) {
                // 在每行的第一个单元格插入图片
                if (downLoadPic && i > 0 && j == 0) {
                    sr.setHeight((short) (800));
                    drawPictureIntoExcel(book, patriarch, i, row.get(0).toString());
                } else {
                    HSSFCell cell = sr.createCell(j);
                    setExcelValue(cell, row.get(j), style);
                }
            }
        }
        return book;
    }

    /**
     * 将图片写入excel
     *
     * @param wb
     * @param patriarch
     * @param rowIndex   当前行数
     * @param pictureUrl 图片链接
     */
    private static void drawPictureIntoExcel(HSSFWorkbook wb, HSSFPatriarch patriarch, int rowIndex, String pictureUrl) {
        try {
            if (StringUtils.isNotBlank(pictureUrl)) {
                URL url = new URL(pictureUrl);
                // 打开链接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                // 设置请求方式为"GET"
                conn.setRequestMethod("GET");
                // 超时响应时间为5秒
                conn.setConnectTimeout(5 * 1000);
                // 通过输入流获取图片数据
                InputStream inStream = conn.getInputStream();
                // 得到图片的二进制数据，以二进制封装得到数据
                byte[] data = readInputStream(inStream);
                // anchor主要用于设置图片的位置
                HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 0, rowIndex, (short) 1, rowIndex + 1);
                // Sets the anchor type （图片在单元格的位置）
                // 0 = Move and size with Cells, 2 = Move but don't size with
                // cells, 3 = Don't move or size with cells.
                anchor.setAnchorType(ClientAnchor.AnchorType.MOVE_AND_RESIZE);
                patriarch.createPicture(anchor, wb.addPicture(data, HSSFWorkbook.PICTURE_TYPE_JPEG));
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        // 创建一个Buffer字符串
        byte[] buffer = new byte[1024];
        // 每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        // 使用一个输入流从buffer里把数据读取出来
        while ((len = inStream.read(buffer)) != -1) {
            // 用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        // 关闭输入流
        inStream.close();
        // 把outStream里的数据写入内存
        return outStream.toByteArray();
    }

}
