package com.richard.bookstore.module.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.richard.bookstore.module.user.dal.mapper.UserMapper;
import com.richard.bookstore.module.user.dal.po.UserPO;
import com.richard.bookstore.module.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/13 21:46
 * @Version 1.0.0-demo
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements UserService {

}
