package org.easy.test;

import org.easy.proxy.EasyProxy;

public class TestCgLib {

	public static void main(String[] args) {
		Test t = (Test) EasyProxy.newInstanceModel(Test.class);
		System.out.println(t.test());
		t =  EasyProxy.newInstanceModel(Test.class);
		System.out.println(t.test());
	}
	
}