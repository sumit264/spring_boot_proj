package com.letsstartcoding.springbootrestapiexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {
	

	@GetMapping("/")
	public String home() {
		System.out.println("============================3============================");
		return ("<h1>Welcome Spring Security</h1>");
		
	}
	
	@GetMapping("/user")
	public String user() {
		System.out.println("============================4============================");
		return ("<h1>Welcome Spring Security user</h1>");
		
	}
	
	@GetMapping("/admin")
	public String admin() {
		System.out.println("============================5===========================");
		return ("<h1>Welcome Spring Security admin</h1>");
		
	}
	
	@GetMapping("/aocc")
	public String aocc() {
		System.out.println("============================11============================");
		return ("<h1>Welcome Spring Securit for <b>AOCC<b> Usery</h1>");
		
	}
	


}
