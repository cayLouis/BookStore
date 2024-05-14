package com.richard.bookstore.module.user.dto;

import lombok.Data;

/**
 * @ClassName UserDTO
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/13 21:02
 * @Version 1.0.0-demo
 */

@Data
public class UserDTO {
    /**
     * 用户名
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickname;
}
