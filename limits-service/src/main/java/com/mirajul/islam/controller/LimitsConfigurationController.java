package com.mirajul.islam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirajul.islam.bean.LimitConfiguration;
import com.mirajul.islam.dao.Configuration;

@RestController
public class LimitsConfigurationController {
	@Autowired 
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		return limitConfiguration;
	}

}
