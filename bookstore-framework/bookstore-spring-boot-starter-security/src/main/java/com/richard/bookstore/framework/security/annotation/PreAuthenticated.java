package com.richard.bookstore.framework.security.annotation;

import java.lang.annotation.*;

/**
 * @ClassName PreAuthenticated
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/13 20:04
 * @Version 1.0.0-demo
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface PreAuthenticated {
}
