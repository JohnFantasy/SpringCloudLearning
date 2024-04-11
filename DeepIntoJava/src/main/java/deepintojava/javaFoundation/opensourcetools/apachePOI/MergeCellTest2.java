package deepintojava.javaFoundation.opensourcetools.apachePOI;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @BelongsProject: JavaSourceCodeLearning
 * @BelongsPackage: com.laofaner.opensourcetools.apachePOI
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-03 15:17
 * @Description: TODO
 * @Version 1.0
 */
public class MergeCellTest2 {

    public static void main(String[] args) {
        MergeCellTest2 mergeCellTest2 = new MergeCellTest2();
        mergeCellTest2.printTender();
    }

    public void printTender() {

        // 第一步，创建一个webbook，对应一个Excel文件  
        HSSFWorkbook wb;
        wb = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet  
        HSSFSheet sheet = wb.createSheet("缴费统计报表");


        // 第四步，创建单元格，并设置值表头 设置表头居中  
        HSSFCellStyle style = wb.createCellStyle();
        style.setVerticalAlignment(VerticalAlignment.CENTER);//垂直
        style.setAlignment(HorizontalAlignment.CENTER);//水平

        // 表头标题样式
        HSSFFont headfont = wb.createFont();
        headfont.setFontName("宋体");
        headfont.setFontHeightInPoints((short) 16);// 字体大小
        HSSFCellStyle headstyle = wb.createCellStyle();
        headstyle.setFont(headfont);
        headstyle.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        headstyle.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
        headstyle.setBorderBottom(BorderStyle.THIN); //下边框
        headstyle.setBorderLeft(BorderStyle.THIN);//左边框
        headstyle.setBorderTop(BorderStyle.THIN);//上边框
        headstyle.setBorderRight(BorderStyle.THIN);//右边框
        headstyle.setLocked(true);

        // 普通单元格样式（中文）
        HSSFFont font2 = wb.createFont();
        font2.setFontName("宋体");
        font2.setFontHeightInPoints((short) 10);
        HSSFCellStyle style2 = wb.createCellStyle();
        style2.setBorderBottom(BorderStyle.THIN); //下边框
        style2.setBorderLeft(BorderStyle.THIN);//左边框
        style2.setBorderTop(BorderStyle.THIN);//上边框
        style2.setBorderRight(BorderStyle.THIN);//右边框
        style2.setFont(font2);
        style2.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        style2.setWrapText(true); // 换行
        style2.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中

        // 普通单元格样式（中文） 无边框
        HSSFCellStyle style3 = wb.createCellStyle();
        style3.setFont(font2);
        style3.setWrapText(true); // 换行
        style3.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
        style3.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        style3.setBorderBottom(BorderStyle.THIN); //下边框
        style3.setBorderLeft(BorderStyle.THIN);//左边框
        style3.setBorderTop(BorderStyle.THIN);//上边框
        style3.setBorderRight(BorderStyle.THIN);//右边框


        // 普通单元格样式（中文） 无边框
        HSSFCellStyle style4 = wb.createCellStyle();
        style4.setFont(font2);
        style4.setWrapText(true); // 换行
        style4.setVerticalAlignment(VerticalAlignment.TOP);// 顶端对齐
        style4.setBorderRight(BorderStyle.THIN);//右边框
        style4.setBorderBottom(BorderStyle.THIN); //下边框
        style4.setBorderLeft(BorderStyle.THIN);//左边框
        style4.setBorderTop(BorderStyle.THIN);//上边框
        style4.setBorderRight(BorderStyle.THIN);//右边框

        // 下边框
        HSSFCellStyle styleBottom = wb.createCellStyle();
        styleBottom.setBorderBottom(BorderStyle.THIN); //下边框
        // 右边框
        HSSFCellStyle styleRight = wb.createCellStyle();
        styleRight.setBorderRight(BorderStyle.THIN);//右边框    
        // 右——下边框
        HSSFCellStyle style_RB = wb.createCellStyle();
        style_RB.setBorderRight(BorderStyle.THIN);//右边框
        style_RB.setBorderBottom(BorderStyle.THIN); //下边框

        // 设置列宽  （第几列，宽度）
        sheet.setColumnWidth(0, 3200);
        sheet.setColumnWidth(1, 3200);
        sheet.setColumnWidth(2, 3500);
        sheet.setColumnWidth(3, 4000);
        sheet.setColumnWidth(4, 4000);
        sheet.setColumnWidth(5, 4000);
        sheet.setColumnWidth(6, 3200);
        sheet.setColumnWidth(7, 3800);
        sheet.setColumnWidth(8, 3800);
        sheet.setColumnWidth(9, 3800);
        sheet.setColumnWidth(10, 3800);
        sheet.setColumnWidth(11, 3800);
        sheet.setColumnWidth(12, 3800);
        sheet.setColumnWidth(13, 3800);
        sheet.setColumnWidth(14, 3800);
        //设置行高----貌似没有效果，所以下面每行独立设置行高
        sheet.setDefaultRowHeight((short) 0x270);

        //在excel中的第4行每列的参数
        String[] head0 = new String[]{"序号", "房号", "缴费项目", "账单编号", "账单名称", "账单金额（元）", "账期", "备注", "缴费金额", "优惠金额", "实际支付金额", "支付人", "订单类型", "支付方式", "支付时间"};
        //对应excel中的行和列，下表从0开始{"开始行,结束行,开始列,结束列"}
        String[] headnum0 = new String[]{"3,4,0,0", "3,3,1,2", "3,3,3,4", "3,3,5,6", "3,4,7,7"};
        String[] headnum1 = new String[]{"4,4,1,1", "4,4,2,2", "4,4,3,3", "4,4,4,4", "4,4,5,5", "4,4,6,6"};
        String[] column0 = new String[]{"工程1", "工程2", "工程3", "工程4", "工程5", "工程6", "工程7", "其他"};

        //第一行
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, head0.length - 1));
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        //设置行高
        row.setHeight((short) 0x270);
        cell.setCellValue("缴费统计报表");
        cell.setCellStyle(headstyle);


        // 第二行标题
        row = sheet.createRow(1);
        row.setHeight((short) 0x200);
        for(int i =0;i<head0.length;i++){
            cell = row.createCell(i);
            cell.setCellValue(head0[i]);
            cell.setCellStyle(style3);
        }


        //动态合并单元格
        for (int i = 0; i < headnum0.length; i++) {
            String[] temp = headnum0[i].split(",");
            Integer startrow = Integer.parseInt(temp[0]);
            Integer overrow = Integer.parseInt(temp[1]);
            Integer startcol = Integer.parseInt(temp[2]);
            Integer overcol = Integer.parseInt(temp[3]);
            sheet.addMergedRegion(new CellRangeAddress(startrow, overrow, startcol, overcol));
        }

        //列名
        for (int i = 0; i < column0.length; i++) {
            row = sheet.createRow(i + 5);
            row.setHeight((short) 0x270);
            cell = row.createCell(0);
            cell.setCellValue(column0[i]);
            cell.setCellStyle(style2);
        }


        // 普通单元格样式（中文） 无边框
        HSSFCellStyle styleDate = wb.createCellStyle();
        styleDate.setFont(font2);
        styleDate.setWrapText(true); // 换行
        styleDate.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
        styleDate.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        styleDate.setBorderBottom(BorderStyle.THIN); //下边框

        sheet.addMergedRegion(new CellRangeAddress(column0.length + 7, column0.length + 7, 5, 6));
        row = sheet.createRow(column0.length + 7);
        row.setHeight((short) 0x460);


        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，  


        // 第六步，将文件存到指定位置
        try {
            //普通文件流下载方式
            File file = new File("C:\\Users\\fanyuzhuo\\Desktop\\缴费统计报表.xls");
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();

//            ByteArrayOutputStream os = new ByteArrayOutputStream();
//            wb.write(os);

        } catch (Exception e) {
            System.out.println("写出文件失败" + e);
        }
    }
}
