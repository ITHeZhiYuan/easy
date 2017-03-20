package org.easy.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;

class EasyModelProxy extends EasyProxyInterface{

	@Override
	public Object[] before(Object[] params) {
		return super.before(params);
	}
	

	@Override
	public Object execute(Object object, Method method, Object[] params, MethodProxy proxy) throws Throwable {
		return super.execute(object, method, params, proxy);
	}
	
	@Override
	public Object after(Object result) {
		if(result == null){
			result = "不能为空";
		}
		return super.after(result);
	}
	
	@Override
	public Object exception(Object object, Method method, Object[] params, MethodProxy proxy) throws Exception {
		return super.exception(object, method, params, proxy);
	}
	
}
