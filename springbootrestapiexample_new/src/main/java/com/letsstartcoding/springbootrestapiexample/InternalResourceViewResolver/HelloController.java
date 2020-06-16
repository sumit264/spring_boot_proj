package com.letsstartcoding.springbootrestapiexample.InternalResourceViewResolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
 
	@RequestMapping("/hello")
	public String home() {
		
		System.out.println("=====Hello======");
		return "hello";
	}
}