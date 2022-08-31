package com.microservices.namingserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.namingserver.model.CurrencyExchange;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}
