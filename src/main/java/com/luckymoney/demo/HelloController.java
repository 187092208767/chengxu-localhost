package com.luckymoney.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Controller+@ResponseBody==@RestController
 */
@Controller
@ResponseBody
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String say(){
        return "说明："+limitConfig.getDescription();
    }
}
