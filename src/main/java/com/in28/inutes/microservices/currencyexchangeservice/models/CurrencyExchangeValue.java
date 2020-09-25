package com.in28.inutes.microservices.currencyexchangeservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CurrencyExchangeValue {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "CURRENCY_FROM")
    private String from;
    @Column(name = "CURRENCY_TO")
    private String to;
    private BigDecimal conversionMultiple;
    private String port;

}
