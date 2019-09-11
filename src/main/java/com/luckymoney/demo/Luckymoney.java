package com.luckymoney.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Luckymoney {
    @Id
    @GeneratedValue
    private  int id;
    private BigDecimal money;
    private  String producer;
    private  String consumer;

}
