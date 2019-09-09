package com.luckymoney.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


//@ConfigurationProperties：
//        　　告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
//        　　prefix = "xxx"：前缀。配置文件中哪个下面的所有属性进行一一映射
@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    private BigDecimal maxmoney;
    private BigDecimal minMoney;
    private String description;

    String an=new String("nihao");

   private static List<String> list=new ArrayList<String>();
    public  void listmethod(){
        list.add("nihao");
        list.add("hello");
    }

    public  static  void main(String [] args){
        for(String str:list){
            System.out.print(str);
        }
    }

    public void setMaxmoney(BigDecimal maxmoney) {
        this.maxmoney = maxmoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getMaxmoney() {
        return maxmoney;
    }

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public String getDescription() {
        return description;
    }
}
