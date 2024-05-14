package com.richard.bookstore.module.user.dal.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.richard.bookstore.module.user.dal.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/13 21:38
 * @Version 1.0.0-demo
 */

@Mapper
public interface UserMapper extends BaseMapper<UserPO> {
}
