package com.letsstartcoding.springbootrestapiexample.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(3)
public class MyFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("Filter in Destroy Method");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("=========Filter 1 is Called=======");
		
		filterChain.doFilter(req, res);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter in init Method");
	}

}
