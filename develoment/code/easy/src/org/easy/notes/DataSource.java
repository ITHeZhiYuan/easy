package org.easy.notes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建日期:2017年3月11日
 * 作者:何志远
 * 描述:数据源配置申明
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DataSource {
	/**
	 * 数据源是否为默认数据源,配置多数据源时将不需要默认的数据源设置为false
	 */
	boolean value() default true;
}
