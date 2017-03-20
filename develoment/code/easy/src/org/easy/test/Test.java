package org.easy.test;

import org.easy.model.EasyEntity;
import org.easy.notes.Attribute;
import org.easy.notes.Model;
import org.easy.notes.Return;

@Model
public class Test extends EasyEntity{
	
	@Attribute
	public String t = "t";
	
	@Return
	public Object test(String str){
		System.out.println("test");
		return null;
	}
	
}
