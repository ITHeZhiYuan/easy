package org.easy.scan;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.easy.config.EasyConfig;
import org.easy.exception.EasyConfigException;
import org.easy.exception.EasyException;
import org.easy.notes.Config;

/**
 * 创建日期:2017年3月12日
 * 作者:何志远
 * 描述:注解扫描工具
 */
class NotesScan {
	
	private static List<Class<?>> tempConfig = null;
	
	/**
	 * @param classList Class<?>集合
	 * @param note 注解Class对象
	 * @return classList中被note注解的Class<?>的集合
	 */
	public static List<Class<?>> NoteScan(Set<Class<?>> classList,Class<? extends Annotation> note){
		List<Class<?>> noteClass = new ArrayList<>();
		for (Class<?> clz : classList) {
			if(null != clz.getAnnotation(note))
				noteClass.add(clz);
		}
		return noteClass;
	}
	
	public static void loadConfig(Set<Class<?>> classList) throws EasyException{
		/*扫描当前项目配置类*/
		for (Class<?> configClz : NotesScan.NoteScan(classList, Config.class)) {
			NotesScan.configScan(classList, configClz);
		}
		tempConfig = null;
	}
	
	private static void configScan(Set<Class<?>> classList,Class<?> config) throws EasyException{
		EasyConfig easyConfig = null;
		Class<?>[] configs = null;
		configCache(config);
		try {
			easyConfig = (EasyConfig)config.newInstance();
			configs = easyConfig.getConfig();
			for (Class<?> clz : configs){
				if(null != clz.getAnnotation(Config.class))
					configScan(classList, clz);
				else
					classList.add(clz);
			}
		} catch (Exception e) {
			throw new EasyConfigException(config.getName());
		}
	}
	
	private static void configCache(Class<?> config) throws EasyException{
		tempConfig = tempConfig == null ? new ArrayList<>() : tempConfig;
		for (Class<?> temp : tempConfig) 
			if(temp == config)
				throw new EasyConfigException(config.getName());
		tempConfig.add(config);
	}
	
}