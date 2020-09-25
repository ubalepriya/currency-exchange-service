package com.in28.inutes.microservices.currencyexchangeservice.repositories;

import com.in28.inutes.microservices.currencyexchangeservice.models.CurrencyExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeValue, Long> {

    CurrencyExchangeValue findByFromAndTo(String from, String to);
}
