package org.easy.exception;

public class EasyControllerException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyControllerException(String message) {
		super("控制层异常:"+message);
	}
	
}
