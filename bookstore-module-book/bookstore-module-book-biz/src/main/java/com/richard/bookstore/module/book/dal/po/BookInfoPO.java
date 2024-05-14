package com.richard.bookstore.module.book.dal.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName BookPO
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/9 21:46
 * @Version 1.0.0-demo
 */
@Data
@TableName("book_info")
public class BookInfoPO {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 书籍名
     */
    private String name;

    /**
     * 书籍描述
     */
    private String comment;

    /**
     * 价格
     */
    private Double price;

    /**
     * ISBN号
     */
    private String isbn;

    /**
     * 封面地址
     */
    private String imgUrl;

    /**
     * 文件地址
     */
    private String fileUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
