package com.rupom.javahomework.week1.Java.Homework;

import org.springframework.boot.CommandLineRunner;
import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaHomeworkApplication implements CommandLineRunner{
	CakeBaker cakeBaker;
	JavaHomeworkApplication(CakeBaker cakeBaker){
		this.cakeBaker = cakeBaker;
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaHomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
