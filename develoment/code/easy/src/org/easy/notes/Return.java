package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.easy.adapter.EasyAdapter;
import org.easy.enumeration.Adapter;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:控制层方法返回值适配器
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Return {
	/**
	 * 控制层方法返回值的适配器,默认为JSON格式
	 */
	Adapter value() default Adapter.JSON;
	
	/**
	 * 适配器的Class对象
	 */
	Class<?> adapter() default EasyAdapter.class;
}