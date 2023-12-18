package com.laofaner.zk.service.impl;

import com.laofaner.zk.entity.ZkConfig;
import com.laofaner.zk.mapper.ZkConfigMapper;
import com.laofaner.zk.service.IZkConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置管理表 服务实现类
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-31
 */
@Service
public class ZkConfigServiceImpl extends ServiceImpl<ZkConfigMapper, ZkConfig> implements IZkConfigService {

}
