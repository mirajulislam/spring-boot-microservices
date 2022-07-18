package com.mirajul.islam.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mirajul.islam.dao.ExchangeValue;

@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue
		(@PathVariable String from, @PathVariable String to){
		
		return new ExchangeValue(1000l,from,to,BigDecimal.valueOf(65));
	}
}