package com.richard.bookstore.module.book;

import com.richard.bookstore.module.book.api.BookInfoApi;
import com.richard.bookstore.module.book.dal.po.BookInfoPO;
import com.richard.bookstore.module.book.service.BookInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName BookInfoServiceTest
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/9 23:10
 * @Version 1.0.0-demo
 */
@SpringBootTest()
public class BookInfoServiceTest {
    @Resource
    private BookInfoService bookInfoService;

    @Test
    public void testInsertBookPO(){
        BookInfoPO bookInfoPO = new BookInfoPO();
        bookInfoPO.setName("测试数据");
        bookInfoPO.setPrice(12.3);
        bookInfoPO.setComment("sjdsjdjojosjdo");
        bookInfoService.save(bookInfoPO);
    }
}
