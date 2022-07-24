package com.currency.exchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.exchange.dao.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}