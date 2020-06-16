package com.letsstartcoding.springbootrestapiexample.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
	
	
	@Bean
	public FilterRegistrationBean registrationBean(){
	    FilterRegistrationBean registrationBean 
	      = new FilterRegistrationBean();
	         
	    registrationBean.setFilter(new MyNewFilter_Customized_Url());
	    registrationBean.addUrlPatterns("/company/");
	         
	    return registrationBean;    
	}

}
