package com.currency.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currency.limits.bean.Limits;
import com.currency.limits.dao.Configuration;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimitsFromConfigurations() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
