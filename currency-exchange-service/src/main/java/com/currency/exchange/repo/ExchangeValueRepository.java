package com.currency.exchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.exchange.dao.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}