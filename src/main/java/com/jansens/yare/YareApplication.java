package com.jansens.yare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jansens.yare"})
public class YareApplication {

	public static void main(String[] args) {
		SpringApplication.run(YareApplication.class, args);
	}

}
