package org.easy.adapter;

/**
 * 创建日期:2017年3月12日
 * 作者:何志远
 * 描述:返回值适配器需要继承这个方法
 */
public interface EasyAdapter {

	public <T> T adapter(Object value);
	
}
