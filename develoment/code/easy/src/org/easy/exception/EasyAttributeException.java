package org.easy.exception;

public class EasyAttributeException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyAttributeException(String message) {
		super("模板属性异常:"+message);
	}
	
}
