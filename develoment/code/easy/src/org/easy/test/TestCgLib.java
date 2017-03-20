package org.easy.test;

import org.easy.proxy.EasyProxy;

public class TestCgLib {

	public static void main(String[] args) throws InterruptedException {
		Test t = EasyProxy.newInstanceModel(Test.class);
		t.test(null);
		
	}
	
}
