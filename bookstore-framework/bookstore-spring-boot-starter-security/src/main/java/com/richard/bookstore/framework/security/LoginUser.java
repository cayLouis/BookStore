package com.richard.bookstore.framework.security;

import cn.hutool.core.map.MapUtil;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LoginUser
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/13 20:23
 * @Version 1.0.0-demo
 */
@Data
public class LoginUser {

    private Long id;

    private Integer userType;

    private Map<String, String> info;

    private Map<String, Object> context;

    public void setContext(String key, Object value){
        if (context == null) {
            context = new HashMap<>();
        }
        context.put(key, value);
    }

    public <T> T getContext(String key, Class<T> type) {
        return MapUtil.get(context, key, type);
    }
}
