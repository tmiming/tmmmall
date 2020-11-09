package com.tmm.mall.support.annotation;

import java.lang.annotation.*;

/**
 * @Author： tangmingming
 * @Date: 2020-10-28 11:08
 * @Version： 1.0
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface IgnoreLog {
}
