package com.letsstartcoding.springbootrestapiexample.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class EmployeeServiceInterceptorAppConfig  extends WebMvcConfigurerAdapter{
	
	@Autowired
	EmployeeServiceInterceptor interceptor;
	

	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(interceptor);
	   }

}
