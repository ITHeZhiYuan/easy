package org.easy.proxy;

import org.easy.model.EasyEntity;

import net.sf.cglib.proxy.Enhancer;

/**
 * 创建日期:2017年3月19日
 * 作者:何志远
 * 描述:创建动态代理对象
 */
public final class EasyProxy {
	
	private final static EasyModelProxy MODEL_PROXY = new EasyModelProxy();
	private final static EasyServiceProxy SERVICE_PROXY = new EasyServiceProxy();

	@SuppressWarnings("unchecked")
	public static <T> T newInstance(Class<?> clz,EasyProxyInterface proxyInterface){
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(proxyInterface);
		enhancer.setSuperclass(clz);
		return (T)enhancer.create();
	}
	
	public static <T> T newInstanceModel(Class<? extends EasyEntity> clz){
		return newInstance(clz, MODEL_PROXY);
	}
	
	public static <T> T newInstanceService(Class<?> clz){
		return newInstance(clz, SERVICE_PROXY);
	}
	
}