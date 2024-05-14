package com.richard.bookstore.framework.security.core;

import com.richard.bookstore.framework.security.annotation.PreAuthenticated;
import com.richard.bookstore.framework.security.util.SecurityFrameworkUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @ClassName PreAuthenticatedAspect
 * @Description 定义一个校验切面
 * @Author 81556
 * @DATE 2024/5/13 20:01
 * @Version 1.0.0-demo
 */
@Aspect
public class PreAuthenticatedAspect {

    @Around("@annotation(PreAuthenticated)")
    public Object around(ProceedingJoinPoint joinPoint, PreAuthenticated preAuthenticated) throws Throwable{
        if (SecurityFrameworkUtils.getLoginUser() == null) {
            throw new Exception();
        }
        return null;
    }
}
