package org.easy.model;

/**
 * 创建日期:2017年3月13日
 * 作者:何志远
 * 描述:Model类的接口
 */
public interface EasyModel<T> {

	/**
	 * 添加/更新
	 */
	public T save();

	/**
	 * 查询条件
	 */
	public T where();
	
	/**
	 * 集合查询
	 */
	public T query();
	
	/**
	 * 根据现有属性查询数据库
	 */
	public T get();
	
	/**
	 * 用于加载外键的方法
	 */
	public T load();
	
	/**
	 * 排序
	 */
	public T order();
	
	/**
	 * 分组
	 */
	public T group();
}
