package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:模板类的属性
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Attribute{
	/**
	 * 对应表中的字段名,为空时字段名默认为属性名
	 */
	String value() default "";
}
