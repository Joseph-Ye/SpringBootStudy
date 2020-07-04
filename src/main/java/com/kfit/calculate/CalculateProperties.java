package com.kfit.calculate;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "calculate")
public class CalculateProperties {

	private int scale;

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}
	
	
}
