package org.easy.proxy;

import org.easy.model.EasyEntity;

import net.sf.cglib.proxy.Enhancer;

/**
 * 创建日期:2017年3月19日
 * 作者:何志远
 * 描述:创建动态代理对象
 */
public class EasyProxy {

	@SuppressWarnings("unchecked")
	public static <T> T newInstance(Class<?> clz,EasyProxyInterface proxyInterface){
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(proxyInterface);
		enhancer.setSuperclass(clz);
		return (T)enhancer.create();
	}
	
	public static <T> T newInstanceModel(Class<? extends EasyEntity> clz){
		return newInstance(clz, new EasyModelProxy());
	}
	
	public static <T> T newInstanceService(Class<?> clz){
		return newInstance(clz, new EasyServiceProxy());
	}
	
}