package com.richard.bookstore.module.book.controller;

import com.richard.bookstore.module.book.dal.po.BookInfoPO;
import com.richard.bookstore.module.book.service.BookInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/10 23:47
 * @Version 1.0.0-demo
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookInfoService bookInfoService;

    @PostMapping("/query")
    public BookInfoPO queryBook(){
        return bookInfoService.getById(1);
    }
}
