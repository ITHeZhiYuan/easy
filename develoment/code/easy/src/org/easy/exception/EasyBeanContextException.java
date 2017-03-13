package org.easy.exception;

public class EasyBeanContextException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyBeanContextException(String message) {
		super("JAVABEAN上下文异常:"+message);
	}
	
}
