package org.easy.scan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.easy.enumeration.Config;
import org.easy.exception.EasyException;
import org.easy.notes.BeanContext;
import org.easy.notes.Controller;
import org.easy.notes.DataSource;
import org.easy.notes.Filter;
import org.easy.notes.Model;
import org.easy.notes.Service;

/**
 * 创建日期:2017年3月12日
 * 作者:何志远
 * 描述:扫描注解,项目配置
 */
public class EasyScan {

	private Set<Class<?>> classList = null;
	private Map<Config,List<Class<?>>> clzMap = new HashMap<>();
	
	public EasyScan() throws EasyException {
		this.classList = new EasyFileScan().list();
		NotesScan.loadConfig(this.classList);
		for (Class<?> class1 : classList) {
			System.out.println(class1.getName());
		}
	}
	
	public Map<Config,List<Class<?>>> scan(){
		this.clzMap.put(Config.FILTER, NotesScan.NoteScan(classList, Filter.class));
		this.clzMap.put(Config.CONTROLLER, NotesScan.NoteScan(classList, Controller.class));
		this.clzMap.put(Config.SERVICE, NotesScan.NoteScan(classList, Service.class));
		this.clzMap.put(Config.BEANCONTEXT, NotesScan.NoteScan(classList, BeanContext.class));
		this.clzMap.put(Config.MODEL, NotesScan.NoteScan(classList, Model.class));
		this.clzMap.put(Config.DATASOURCE, NotesScan.NoteScan(classList, DataSource.class));
		return this.clzMap;
	}
	
	public static void main(String[] args) throws EasyException {
		new EasyScan().scan();
	}
	
}