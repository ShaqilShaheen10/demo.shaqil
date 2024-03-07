package com.shaqil.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(DemoApplication.class, args);
		MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}

}
