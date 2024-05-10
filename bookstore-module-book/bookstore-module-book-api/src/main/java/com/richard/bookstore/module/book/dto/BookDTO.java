package com.richard.bookstore.module.book.dto;

import com.richard.bookstore.module.book.enums.BookTag;
import lombok.Data;

import java.util.List;

/**
 * @ClassName BookDTO
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/8 21:05
 * @Version 1.0.0-demo
 */
@Data
public class BookDTO {
    /**
     * 书名
     */
    private String name;

    /**
     * 描述
     */
    private String desc;

    /**
     * 标签
     */
    private List<BookTag> bookTags;
}
