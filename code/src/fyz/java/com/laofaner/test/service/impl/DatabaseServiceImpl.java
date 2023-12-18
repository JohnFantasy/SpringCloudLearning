package com.laofaner.test.service.impl;

import com.laofaner.test.entity.Database;
import com.laofaner.test.mapper.DatabaseMapper;
import com.laofaner.test.service.IDatabaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库管理表 服务实现类
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-07-31
 */
@Service
public class DatabaseServiceImpl extends ServiceImpl<DatabaseMapper, Database> implements IDatabaseService {

}
