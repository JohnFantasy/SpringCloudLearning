package com.laofaner.springboot.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laofaner.springboot.test.entity.Database;
import com.laofaner.springboot.test.mapper.DatabaseMapper;
import com.laofaner.springboot.test.service.IDatabaseService;
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
