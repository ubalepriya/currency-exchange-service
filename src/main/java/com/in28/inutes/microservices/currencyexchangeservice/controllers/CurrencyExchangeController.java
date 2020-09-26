package com.in28.inutes.microservices.currencyexchangeservice.controllers;

import com.in28.inutes.microservices.currencyexchangeservice.config.AppConfig;
import com.in28.inutes.microservices.currencyexchangeservice.models.CurrencyExchangeValue;
import com.in28.inutes.microservices.currencyexchangeservice.services.CurrencyExchangeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
public class CurrencyExchangeController {

    private final AppConfig appConfig;
    private final CurrencyExchangeService currencyExchangeService;

    public CurrencyExchangeController(AppConfig appConfig, CurrencyExchangeService currencyExchangeService) {
        this.appConfig = appConfig;
        this.currencyExchangeService = currencyExchangeService;
    }

    @GetMapping("/exchange/from/{from}/to/{to}")
    public CurrencyExchangeValue getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to)
    {
        CurrencyExchangeValue currencyExchangeValue =   currencyExchangeService.getCurrencyExchangeValue(from, to);
        String serverPort   =   appConfig.getPort();

        if(currencyExchangeValue != null)
        {
            currencyExchangeValue.setPort(serverPort);
        }
        return currencyExchangeValue;
    }
}
