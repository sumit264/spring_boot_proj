package com.letsstartcoding.springbootrestapiexample.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class MyNewFilter_Customized_Url implements Filter{

	@Override
	public void destroy() {
		System.out.println("MyNewFilter_Customized_Url in Destroy Method");		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("=========MyNewFilter_Customized_Url in doFilter Method=======");		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("========MyNewFilter_Customized_Url in Init Method======");		
	}

}
