package com.luckymoney.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

/**
 * @Controller+@ResponseBody==@RestController
 */
@RestController
@RequestMapping("/dir")
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping({"/hello","hi"})
    public String say(){
        return "说明："+limitConfig.getDescription();
    }
    //http传送的请求中可以含有参数
    @GetMapping("/say1")
    public String say1(@RequestParam(value = "id",defaultValue = "",required = false) int id){
        return "id:"+id;
    }
    @GetMapping
    public String sayhello(){
        return  "sayhello to"+ limitConfig.getDescription();
    }
    @GetMapping("constru")
    @Override
    public String toString() {
        //已知对象，通过对象来获取对象的类名，从而获取类的信息
        Class c1=limitConfig.getClass();
        String className=c1.getName();
        Class super1=c1.getSuperclass();
        String modifies = Modifier.toString(c1.getModifiers());
        if(modifies.length()>=0)System.out.println(modifies);
        return printConstructors(c1);
    }

    public String printConstructors(Class cl){
        Constructor []constructor=cl.getConstructors();
        StringBuilder stringBuilder=new StringBuilder();
        for(Constructor c:constructor){
            String modif=Modifier.toString(c.getModifiers());
            String name=c.getName();
            stringBuilder.append(modif+"  ");
            stringBuilder.append(name+"(");
            Class[] paramType=c.getParameterTypes();
            for (int i=0;i<paramType.length;i++){
                if(i>0) stringBuilder.append(".");
               stringBuilder.append(paramType[i].getName()) ;
            }
            stringBuilder.append(");");
        }
        return  stringBuilder.toString();
    }
}
