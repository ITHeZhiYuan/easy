package org.easy.exception;

public class EasyDataSourceException extends EasyException{

	private static final long serialVersionUID = 1L;

	public EasyDataSourceException(String message) {
		super("数据源异常:"+message);
	}
	
}
