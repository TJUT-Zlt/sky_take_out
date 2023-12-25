package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:AutoFill
 * Package:com.sky.annotation
 * Description:  自定义注解 用于标识某个方法需要进行公共字段自动填充
 *
 * @Author abel
 * @Create 2023-12-25 10:32
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型:UPDATE INSERT
    OperationType value();
}
