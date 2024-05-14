package com.richard.bookstore.framework.common.pojo;

import cn.hutool.core.lang.Assert;
import com.richard.bookstore.framework.common.exception.enums.GlobalErrorCodeConstants;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName CommonResult
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/11 18:58
 * @Version 1.0.0-demo
 */
@Data
public class CommonResult<T> implements Serializable {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 错误提示
     */
    private String msg;

    public static <T> CommonResult<T> error(Integer code, String message) {
        Assert.isTrue(!GlobalErrorCodeConstants.SUCCESS.getCode().equals(code));
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.msg = message;
        return result;
    }

    public static <T> CommonResult<T> error(CommonResult<?> result){
        return error(result.getCode(), result.getMsg());
    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = GlobalErrorCodeConstants.SUCCESS.getCode();
        result.data = data;
        result.msg = "";
        return result;
    }


}
