package com.example.applicationcontext;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.applicationcontext.dao")
public class ApplicationContextStart {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextStart.class, args);
	}
}
