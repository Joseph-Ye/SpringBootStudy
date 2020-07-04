package com.kfit.calculate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kfit.calculate.CalculateProperties;
import com.kfit.calculate.CalculateService;

@Configuration // 指定这是配置类
@ConditionalOnClass(CalculateService.class) //当存在类CalculateService的时候
@EnableConfigurationProperties(CalculateProperties.class)
public class CalculateAutoConfigure {
	@Autowired
	private CalculateProperties calculateProperties;
	
	
	//注入CalculateService
	@Bean
	@ConditionalOnMissingBean(CalculateService.class)
	@ConditionalOnProperty(prefix = "calculate",value = "enabled",havingValue = "true")
	public CalculateService calculateService() {
		return new CalculateService(calculateProperties.getScale());
	}
}
