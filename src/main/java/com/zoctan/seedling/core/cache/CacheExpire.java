package com.zoctan.seedling.core.cache;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 缓存过期注解
 *
 * @author Zoctan
 * @date 2018/07/11
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CacheExpire {
    /**
     * 过期时间，默认 60s
     */
    @AliasFor("expire")
    long value() default 60L;

    /**
     * 过期时间，默认 60s
     */
    @AliasFor("value")
    long expire() default 60L;
}