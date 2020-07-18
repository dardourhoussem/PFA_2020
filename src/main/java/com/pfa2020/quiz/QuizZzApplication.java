package com.pfa2020.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.pfa2020.quiz")
public class QuizZzApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizZzApplication.class, args);
	}
}
