package org.easy.proxy;

import org.easy.model.EasyEntity;

import net.sf.cglib.proxy.Enhancer;

/**
 * 创建日期:2017年3月19日
 * 作者:何志远
 * 描述:创建动态代理对象
 */
public class EasyProxy {

	public static Object newInstance(Class<?> clz,EasyProxyInterface proxyInterface){
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(proxyInterface);
		enhancer.setSuperclass(clz);
		return enhancer.create();
	}
	
	public static Object newInstanceModel(Class<? extends EasyEntity> clz){
		return newInstance(clz, new EasyModelProxy());
	}
	
	public static Object newInstanceService(Class<?> clz){
		return newInstance(clz, new EasyModelProxy());
	}
	
}