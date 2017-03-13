package org.easy.exception;

public class EasyMethodException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyMethodException(String message) {
		super("请求方式异常:"+message);
	}
	
}
