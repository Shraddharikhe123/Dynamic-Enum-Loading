package com.codingstandard.demo.appconfig;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.codingstandard.demo.handler")
@ComponentScan(basePackages = "com.codingstandard.demo.*")
@SpringBootApplication
public class CodingStandardsApplication  {


	public static void main(String[] args) {
		SpringApplication.run(CodingStandardsApplication.class, args);

	}
}




