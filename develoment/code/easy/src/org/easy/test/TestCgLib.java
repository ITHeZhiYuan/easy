package org.easy.test;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TestCgLib {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(new CglibProxy());
		//动态代理一个类
		enhancer.setSuperclass(Test.class);
		Test t = (Test) enhancer.create();
		System.out.println(t.test());
		//动态代理并实现接口
		//enhancer.setSuperclass(T.class);
		//T t1 = (T)enhancer.create();
		//t1.test();
	}
	
}

class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("执行前");
		proxy.invokeSuper(object, args);
		System.out.println("执行后");
		return "555";
	}
	
}