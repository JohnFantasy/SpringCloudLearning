package com.laofaner.springboot.mybatisplus.service.impl;

import com.laofaner.mybatisplus.entity.User;
import com.laofaner.mybatisplus.mapper.UserMapper;
import com.laofaner.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fyz
 * @since 2022-10-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
