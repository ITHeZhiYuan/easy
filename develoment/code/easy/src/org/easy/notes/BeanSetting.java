package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:设置JavaBean的Class
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BeanSetting {
	/**
	 * JavaBean的Class对象
	 */
	Class<?> value();
	/**
	 * 构造器参数
	 */
	String[] constructor() default {};
	/**
	 * 单例模式,默认为false
	 */
	boolean single() default false;
}
