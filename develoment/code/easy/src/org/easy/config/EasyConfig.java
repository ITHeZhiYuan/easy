package org.easy.config;

/**
 * 创建日期:2017年3月12日
 * 作者:何志远
 * 描述:配置类需要继承这个类才能使用
 */
public abstract class EasyConfig {
	
	private Class<?>[] config;

	protected void setConfig(Class<?>[] config){
		this.config = config;
	}
	
	public Class<?>[] getConfig(){
		return this.config;
	}
	
}
