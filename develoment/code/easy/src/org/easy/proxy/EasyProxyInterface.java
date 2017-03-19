package org.easy.proxy;

import java.lang.reflect.Method;

import org.easy.exception.EasyProxyException;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * 创建日期:2017年3月19日
 * 作者:何志远
 * 描述:实现动态代理抽象类
 */
public abstract class EasyProxyInterface implements MethodInterceptor{
	
	public Object[] before(Object[] params){
		return params;
	}
	
	public Object execute(Object object, Method method, Object[] params, MethodProxy proxy) throws Throwable{
		return proxy.invokeSuper(object, params);
	}
	
	public Object after(Object result){
		return result;
	};
	
	public Object exception(Object object, Method method, Object[] params, MethodProxy proxy) throws Exception{
		throw new EasyProxyException("执行失败");
	}
	
	@Override
	public final Object intercept(Object object, Method method, Object[] params, MethodProxy proxy) throws Throwable{
		Object result;
		try {
			params = before(params);
			result = execute(object, method, params, proxy);
			result = after(result);
		} catch (Exception e) {
			result = exception(object, method, params, proxy);
		}
		return result;
	}
	
}
