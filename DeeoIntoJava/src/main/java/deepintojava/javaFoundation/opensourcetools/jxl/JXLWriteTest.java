package deepintojava.javaFoundation.opensourcetools.jxl;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import deepintojava.javaFoundation.opensourcetools.easyexcel.BillExcelListener;
import deepintojava.javaFoundation.opensourcetools.easyexcel.BillImportVO;
import jxl.Workbook;
import jxl.write.*;

import java.io.*;
import java.util.List;

/**
 * @BelongsProject: JavaSourceCodeLearning
 * @BelongsPackage: com.laofaner.opensourcetools.jxl
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-02 16:50
 * @Description: TODO
 * @Version 1.0
 */
public class JXLWriteTest {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\fanyuzhuo\\Desktop\\77.xls");
        try {
            OutputStream os = new FileOutputStream(file);
            WritableWorkbook workbook = Workbook.createWorkbook(os);
            // 创建工作簿sheet
            WritableSheet sheet = workbook.createSheet("underwrite", 0);
            // 3.设置column名
            sheet.addCell(new Label(0, 0, "小区名称"));
            sheet.addCell(new Label(1, 0, "楼栋"));
            sheet.addCell(new Label(2, 0, "单元号"));
            sheet.addCell(new Label(3, 0, "户号"));
            sheet.addCell(new Label(4, 0, "缴费项目"));
            sheet.addCell(new Label(5, 0, "账单名称"));
            sheet.addCell(new Label(6, 0, "金额"));
            sheet.addCell(new Label(7, 0, "账期"));
            sheet.addCell(new Label(8, 0, "备注"));
            // 4.把核保的数据填充到工作簿中 service调用selectExport()查询数据库
            //1、读取Excel
            BillExcelListener listener = new BillExcelListener();
            ExcelReader excelReader = null;
            File file0 = new File("C:\\Users\\fanyuzhuo\\Desktop\\billImport.xls");
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file0);
                excelReader = new ExcelReader(fileInputStream, ExcelTypeEnum.XLS, null, listener);
            } catch (Exception e) {

            }
            excelReader.read(new Sheet(1, 1, BillImportVO.class));
            List<BillImportVO> list = listener.getDatas();

            System.out.println(list.toArray());
            try{
                for (int i = 0, j = 1; i < list.size(); i++, j++) {
                    BillImportVO billImportVO = list.get(i);
                    //System.out.println(underwrite);
                    //设置列宽
                    sheet.setColumnView(i, 16);
                    //重新设置部分列宽
                    sheet.setColumnView(3, 14);
                    sheet.setColumnView(6, 10);
                    sheet.setColumnView(7, 10);
                    //设置行高
                    sheet.setRowView(i, 350);
                    //设置字体的attribute
                    WritableFont font1=new WritableFont(WritableFont.createFont("宋体"), 12, WritableFont.NO_BOLD);
                    WritableCellFormat format1=new WritableCellFormat(font1);
                    sheet.addCell(new Label(0, j, billImportVO.getCommunityName(),format1));
                    sheet.addCell(new Label(1, j, billImportVO.getFloorNo(),format1));
                    sheet.addCell(new Label(2, j, billImportVO.getUnitNo(),format1));
                    sheet.addCell(new Label(3, j, billImportVO.getHouseNo(),format1));
                    sheet.addCell(new Label(4, j, billImportVO.getProjectName(),format1));
                    sheet.addCell(new Label(5, j, billImportVO.getBillName(),format1));
                    sheet.addCell(new Label(6, j, billImportVO.getAmountStr(),format1));
                    sheet.addCell(new Label(7, j, billImportVO.getPayTerm(),format1));
                    sheet.addCell(new Label(8, j, billImportVO.getDescription(),format1));
                    sheet.addCell(new Label(9, j, billImportVO.getErrorInfo(),format1));
                }}catch (Exception e){
                e.printStackTrace();
            }
            // 5.写入数据
            workbook.write();
            // 6.关闭资源
            workbook.close();
        } catch (WriteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
