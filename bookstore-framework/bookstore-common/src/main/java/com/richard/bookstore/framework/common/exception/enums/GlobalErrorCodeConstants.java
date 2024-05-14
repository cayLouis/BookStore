package com.richard.bookstore.framework.common.exception.enums;

import com.richard.bookstore.framework.common.exception.ErrorCode;

/**
 * @ClassName GlobalErrorCodeConstants
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/11 19:18
 * @Version 1.0.0-demo
 */
public interface GlobalErrorCodeConstants {

    ErrorCode SUCCESS = new ErrorCode(0, "成功");

    ErrorCode BAD_REQUEST = new ErrorCode(400, "请求参数不正确");

}
