package org.easy.exception;

/**
 * 创建日期:2017年3月12日
 * 作者:何志远
 * 描述:异常类
 */
public class EasyException extends Exception{

	private String message;
	
	private static final long serialVersionUID = 1L;
	
	public EasyException() {
		super();
	}

	public EasyException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
		super.printStackTrace();
	}
	
}
