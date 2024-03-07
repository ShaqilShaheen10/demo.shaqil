package com.shaqil.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    @Autowired
    private void setMyFirstClass(
             MyFirstClass myFirstClass
    ){
        this.myFirstClass=myFirstClass;
    }


    public String tellAStory() {
        return "The dependency is saying: " + myFirstClass.sayHello();
    }
}
