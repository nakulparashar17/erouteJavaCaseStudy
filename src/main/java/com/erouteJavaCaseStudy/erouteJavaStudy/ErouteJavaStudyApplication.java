package com.erouteJavaCaseStudy.erouteJavaStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ErouteJavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErouteJavaStudyApplication.class, args);
	}

}
