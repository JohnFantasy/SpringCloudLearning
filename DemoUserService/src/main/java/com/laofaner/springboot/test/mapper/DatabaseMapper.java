package com.laofaner.springboot.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laofaner.springboot.test.entity.Database;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据库管理表 Mapper 接口
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-07-31
 */
@Mapper
public interface DatabaseMapper extends BaseMapper<Database> {

}
