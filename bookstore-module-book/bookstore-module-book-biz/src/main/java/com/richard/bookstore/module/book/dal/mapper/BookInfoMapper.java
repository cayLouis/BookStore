package com.richard.bookstore.module.book.dal.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.richard.bookstore.module.book.dal.po.BookInfoPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName BookInfoMapper
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/9 22:51
 * @Version 1.0.0-demo
 */
@Mapper
public interface BookInfoMapper extends BaseMapper<BookInfoPO> {

}
