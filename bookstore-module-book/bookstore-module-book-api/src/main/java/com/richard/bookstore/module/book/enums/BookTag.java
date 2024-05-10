package com.richard.bookstore.module.book.enums;

/**
 * @ClassName BookTag
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/8 21:19
 * @Version 1.0.0-demo
 */
public enum BookTag {

    FUNNY(1, "搞笑");

    private Integer code;
    private String desc;

    BookTag(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
