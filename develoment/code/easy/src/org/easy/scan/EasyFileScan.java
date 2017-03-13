package org.easy.scan;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

class EasyFileScan {
	
	private File filePath = null;
	
	private int index =  0;
	
	private int end = 6;
	
	public EasyFileScan() {
		this.filePath = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath());
		String temp = this.filePath.getAbsolutePath();
		this.index = temp.endsWith("\\") ? temp.length() : (temp.length() +1);
	}
	
	public Set<Class<?>> list(){
		Set<Class<?>> list = new HashSet<>();
		scanFile(this.filePath, list);
		return list;
	}
	
	private void scanFile(File file,Set<Class<?>> list){
		if(file.isDirectory())
			for (File temp : file.listFiles()) 
				scanFile(temp, list);
		else
			addClassFile(file, list);
	}
	
	private void addClassFile(File file,Set<Class<?>> list){
		String path = file.getAbsolutePath();
		path = path.substring(index,path.length()-end).replace("\\", ".");
		try {
			list.add(Class.forName(path));
		} catch (ClassNotFoundException e) {
			//加载Class文件失败
			e.printStackTrace();
		}
	}
	
}
