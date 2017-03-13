package org.easy.exception;

public class EasyServiceException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyServiceException(String message) {
		super("业务层处理异常:"+message);
	}
	
}
