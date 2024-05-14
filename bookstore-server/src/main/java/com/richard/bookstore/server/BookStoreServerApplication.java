package com.richard.bookstore.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.richard.bookstore"})
@MapperScan("com.richard.bookstore.module.book.dal.mapper")
public class BookStoreServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreServerApplication.class, args);
    }
}
