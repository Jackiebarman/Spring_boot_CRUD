package com.example.gradletest;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EnableJpaRepositories("");
//@EntityScan("com.example.gradletest.Entities")
public class GradletestApplication implements CommandLineRunner, ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(GradletestApplication.class, args);

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {

		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(final CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*")
						.allowedHeaders("*").allowedOrigins("*");
			}
		};
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello From Command line Runner!!!");
	}
	@Override
	public  void run(ApplicationArguments args) throws Exception{
		System.out.println("Hello from Application Runner!!!");
	}



}
