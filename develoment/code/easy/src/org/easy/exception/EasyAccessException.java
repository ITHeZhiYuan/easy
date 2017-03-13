package org.easy.exception;

public class EasyAccessException extends EasyException{

	private static final long serialVersionUID = 1L;
	
	public EasyAccessException(String message) {
		super("控制层权限异常:"+message);
	}

}
