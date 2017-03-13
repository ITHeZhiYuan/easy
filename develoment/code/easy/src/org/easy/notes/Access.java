package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:控制层方法权限判断
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Access {
	Class<?> value();
}
