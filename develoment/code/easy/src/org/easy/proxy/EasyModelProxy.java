package org.easy.proxy;

import java.lang.reflect.Method;

import org.easy.notes.Attribute;
import org.easy.notes.Model;
import org.easy.notes.Return;

import net.sf.cglib.proxy.MethodProxy;

class EasyModelProxy extends EasyProxyInterface{

	@Override
	public Object[] before(Object[] params) {
		return super.before(params);
	}
	

	@Override
	public Object execute(Object object, Method method, Object[] params, MethodProxy proxy) throws Throwable {
		System.out.println(method.getName() + "--" + method.getReturnType());
		System.out.println(method.getAnnotation(Return.class));
		System.out.println(object.getClass().getField("t").getAnnotation(Attribute.class));
		System.out.println(object.getClass().getSuperclass().getAnnotation(Model.class));
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
