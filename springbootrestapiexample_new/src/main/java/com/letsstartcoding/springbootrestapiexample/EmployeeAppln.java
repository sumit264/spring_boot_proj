package com.letsstartcoding.springbootrestapiexample;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableJpaAuditing
@EnableSwagger2
@EnableScheduling //It's used to enable scheduling
public class EmployeeAppln implements ApplicationRunner{
	
	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeAppln.class, args);
		
	}
	
	//define  bean in SpringBoot

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
		
	}

	//Application Runner -it's used to execute the code after spring boot application started
	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		System.out.println("Hello Spring Boot How are You");
	}
}
