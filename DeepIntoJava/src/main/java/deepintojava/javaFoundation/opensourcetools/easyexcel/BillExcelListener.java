package deepintojava.javaFoundation.opensourcetools.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExcelListener
 * @Description TODO
 * @Author fyz
 * @Date 3/14/2019 19:30 PM
 * @Version 1.0
 */
public class BillExcelListener extends AnalysisEventListener<BillImportVO> {

    //自定义用于暂时存储data。
    //可以通过实例获取该值
    private List<BillImportVO> datas = new ArrayList<>();

    @Override
    public void invoke(BillImportVO billRowVO, AnalysisContext context) {
        datas.add(billRowVO);//数据存储到list，供批量处理，或后续自己业务逻辑处理。
        doSomething(billRowVO);//根据自己业务做处理
    }

    private void doSomething(BillImportVO billRowVO) {
        //1、入库调用接口
//        System.out.println();
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // datas.clear();//解析结束销毁不用的资源
    }

    public List<BillImportVO> getDatas() {
        return datas;
    }

    public void setDatas(List<BillImportVO> datas) {
        this.datas = datas;
    }

}