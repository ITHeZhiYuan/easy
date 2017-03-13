package org.easy.exception;

public class EasyConfigException extends EasyException{

	private static final long serialVersionUID = 1L;
	
	public EasyConfigException(String message) {
		super("JAVA配置类异常:"+message);
	}

}
