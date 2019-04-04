package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.TBill;
/**
*  @author author
*/
public interface TBillBaseMapper {

    int insertTBill(TBill object);

    int updateTBill(TBill object);

    int update(TBill.UpdateBuilder object);

    List<TBill> queryTBill(TBill object);

    TBill queryTBillLimit1(TBill object);

}