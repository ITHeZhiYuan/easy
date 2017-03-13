package org.easy.test;

import java.util.Date;

import org.easy.config.EasyConfig;
import org.easy.notes.Config;

@Config
public class TestConfig extends EasyConfig{

	private Class<?>[] lsbcConfig = new Class<?>[]{Date.class,Object.class};
	
	public TestConfig() {
		super.setConfig(this.lsbcConfig);
	}
	
}
