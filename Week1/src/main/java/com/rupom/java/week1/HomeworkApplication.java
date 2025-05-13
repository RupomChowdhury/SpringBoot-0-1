package com.rupom.java.week1;

import org.springframework.boot.CommandLineRunner;
import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication implements CommandLineRunner{
	CakeBaker cakeBaker;
	HomeworkApplication(CakeBaker cakeBaker){
		this.cakeBaker = cakeBaker;
	}
	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
