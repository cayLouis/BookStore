package com.richard.bookstore.framework.common.enums;

import cn.hutool.core.util.ObjUtil;
import com.richard.bookstore.framework.common.core.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @ClassName CommonStatusEnum
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/11 19:07
 * @Version 1.0.0-demo
 */
@Getter
@AllArgsConstructor
public enum CommonStatusEnum implements IntArrayValuable {
    ENABLE(0, "开启"),
    DISABLE(1, "关闭");

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(CommonStatusEnum::getStatus).toArray();

    private final Integer status;

    private final String name;

    @Override
    public int[] array() {
        return ARRAYS;
    }

    public static boolean isEnable(Integer status){
        return ObjUtil.equal(ENABLE.status, status);
    }

    public static boolean isDisable(Integer status){
        return ObjUtil.equal(DISABLE.status, status);
    }

}
