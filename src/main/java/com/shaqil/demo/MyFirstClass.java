package com.shaqil.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
@ComponentScan(basePackages = "com.shaqil.demo.MyFirstService")
@Service
public class MyFirstClass {
    private String myVar;
    @Autowired
    public MyFirstClass(@Qualifier("myThirdBean") String myVar) {
        this.myVar = myVar;
    }



    public String sayHello(){
        return "SpringBootDemo says ==> myVar = "+ myVar;
    }
}
