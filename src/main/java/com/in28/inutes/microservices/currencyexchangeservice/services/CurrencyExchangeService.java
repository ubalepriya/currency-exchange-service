package com.in28.inutes.microservices.currencyexchangeservice.services;

import com.in28.inutes.microservices.currencyexchangeservice.models.CurrencyExchangeValue;
import com.in28.inutes.microservices.currencyexchangeservice.repositories.CurrencyExchangeRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    private final CurrencyExchangeRepository currencyExchangeRepository;


    public CurrencyExchangeService(CurrencyExchangeRepository currencyExchangeRepository) {
        this.currencyExchangeRepository = currencyExchangeRepository;
    }

    public CurrencyExchangeValue getCurrencyExchangeValue(String from, String to)
    {
        return currencyExchangeRepository.findByFromAndTo(from,to);
    }
}
