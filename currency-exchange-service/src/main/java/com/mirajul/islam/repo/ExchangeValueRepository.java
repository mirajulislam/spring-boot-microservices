package com.mirajul.islam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirajul.islam.dao.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}