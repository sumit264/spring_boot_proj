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
@Order(2)
public class MyFilter_2  implements Filter{

	@Override
	public void destroy() {
		System.out.println("Filter_2 in Destroy Method");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain1)
			throws IOException, ServletException {
		System.out.println("=========Filter 2 is Called=======");
		
		filterChain1.doFilter(req, res);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter_2 in init Method");
	}

}
