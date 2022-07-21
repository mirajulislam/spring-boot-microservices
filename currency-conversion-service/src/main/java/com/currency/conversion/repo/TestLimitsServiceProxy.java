package com.currency.conversion.repo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="limits-service")
public interface TestLimitsServiceProxy {
	@GetMapping("/limits-service/limit-test/")
	public String testValue();
}
