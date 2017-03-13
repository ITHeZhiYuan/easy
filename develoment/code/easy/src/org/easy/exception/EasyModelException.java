package org.easy.exception;

public class EasyModelException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyModelException(String message) {
		super("模板异常:"+message);
	}
	
}
