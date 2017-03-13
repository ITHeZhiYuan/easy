package org.easy.test;

import java.util.Date;

import org.easy.config.EasyConfig;
import org.easy.notes.Config;

@Config
public class LsbcConfig extends EasyConfig{
	
	private Class<?>[] lsbcConfig = new Class<?>[]{Date.class};
	
	public LsbcConfig() {
		super.setConfig(this.lsbcConfig);
	}
	

}
