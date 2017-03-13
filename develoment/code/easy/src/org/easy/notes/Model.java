package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:用来申明模板类
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Model {
	/**
	 * 对应表的表明,为空时默认为类名
	 */
	String value() default "";
	/**
	 * 对应的数据源,默认为默认数据源
	 */
	String dataSource() default "";
}
