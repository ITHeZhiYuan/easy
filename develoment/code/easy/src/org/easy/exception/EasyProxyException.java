package org.easy.exception;

public class EasyProxyException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyProxyException(String message) {
		super("对象代理:"+message);
	}
	
}
