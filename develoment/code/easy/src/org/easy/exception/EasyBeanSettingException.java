package org.easy.exception;

public class EasyBeanSettingException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyBeanSettingException(String message) {
		super("JavaBean设置异常:"+message);
	}
	
}
