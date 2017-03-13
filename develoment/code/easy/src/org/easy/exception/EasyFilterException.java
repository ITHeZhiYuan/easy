package org.easy.exception;

public class EasyFilterException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyFilterException(String message) {
		super("过滤器异常:"+message);
	}
	
}
