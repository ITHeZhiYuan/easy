package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:控制层方法请求方式
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Method {
	/**
	 * 控制层方法请求方式,默认为所有请求方式
	 */
	org.easy.enumeration.Method[] value() 
	default {
		org.easy.enumeration.Method.POST,
		org.easy.enumeration.Method.GET,
		org.easy.enumeration.Method.PUT,
		org.easy.enumeration.Method.DELETE
	};
}
