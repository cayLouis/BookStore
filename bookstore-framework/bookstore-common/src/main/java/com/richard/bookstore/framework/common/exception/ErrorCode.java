package com.richard.bookstore.framework.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName ErrorCode
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/11 19:19
 * @Version 1.0.0-demo
 */
@Data
@AllArgsConstructor
public class ErrorCode {
    /**
     * 错误码
     */
    private final Integer code;

    /**
     * 错误信息
     */
    private final String msg;
}
