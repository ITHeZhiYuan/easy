package org.easy.exception;

public class EasyReturnException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyReturnException(String message) {
		super("控制层返回值适配器异常:"+message);
	}
	
}
