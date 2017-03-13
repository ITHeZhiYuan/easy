package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月12日
 * 作者:何志远
 * 描述:过滤器配置
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Filter {
	/**
	 * 过滤器优先级配置
	 */
	int value() default 0;
}
