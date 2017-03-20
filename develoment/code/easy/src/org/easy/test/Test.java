package org.easy.test;

import org.easy.model.EasyEntity;
import org.easy.notes.Controller;

@Controller
public class Test extends EasyEntity{

	public Object test(){
		System.out.println("test");
		return null;
	}
	
}
