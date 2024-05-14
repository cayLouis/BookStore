package com.richard.bookstore.framework.security.util;

import com.richard.bookstore.framework.security.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @ClassName SecurityFrameworkUtils
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/13 20:14
 * @Version 1.0.0-demo
 */
public class SecurityFrameworkUtils {

    private SecurityFrameworkUtils(){}

    /**
     * 获取当前认证信息
     * @return
     */
    public static Authentication getAuthentication() {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context == null) {
            return null;
        }
        return context.getAuthentication();
    }

    public static LoginUser getLoginUser() {
        Authentication authentication = getAuthentication();
        if (authentication == null) {
            return null;
        }
        return authentication.getPrincipal() instanceof LoginUser ? (LoginUser) authentication.getPrincipal() : null;
    }


}
