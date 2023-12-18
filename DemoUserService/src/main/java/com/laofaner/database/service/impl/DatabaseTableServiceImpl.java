package com.laofaner.database.service.impl;

import com.laofaner.database.entity.DatabaseTable;
import com.laofaner.database.mapper.DatabaseTableMapper;
import com.laofaner.database.service.IDatabaseTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库表接入记录表 服务实现类
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-07
 */
@Service
public class DatabaseTableServiceImpl extends ServiceImpl<DatabaseTableMapper, DatabaseTable> implements IDatabaseTableService {

}
