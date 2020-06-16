/*package com.letsstartcoding.springbootrestapiexample;

import javax.annotation.sql.DataSourceDefinition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Autowired
	UserDetailsService userDetailsService;
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 System.out.println("========================================================");
//set my Configuration to this auth Object
		 //=======In Memory Authentication=======
		 
	        
	        auth.inMemoryAuthentication()
	        .withUser("blah")
	        .password("blah")
	        .roles("USER")
	        .and()
	        .withUser("foo")
	        .password("foo")
	        .roles("ADMIN");
		 
		 //=======In Memory Authentication=======
	        
	        //============JDBC Authentication========
		 auth.jdbcAuthentication();
		 
		 

	    }
	 
	 @Bean
	 public PasswordEncoder passwordEncoder() {
	     return NoOpPasswordEncoder.getInstance();
	 }
	 
	// Secure the endpoins with HTTP Basic authentication
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http
	                //HTTP Basic authentication
	                .httpBasic()
	                .and()
	                .authorizeRequests()
	                .antMatchers(HttpMethod.GET, "/books/**").hasRole("USER")
	                .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
	                .antMatchers(HttpMethod.PUT, "/books/**").hasRole("ADMIN")
	                .antMatchers(HttpMethod.PATCH, "/books/**").hasRole("ADMIN")
	                .antMatchers(HttpMethod.DELETE, "/books/**").hasRole("ADMIN")
	                .and()
	                .csrf().disable()
	                .formLogin().disable();
	        
	        http.authorizeRequests()
	        .antMatchers("/admin").hasRole("ADMIN")
	        .antMatchers("/user").hasAnyRole("ADMIN","USER")
	        .antMatchers("/").permitAll()
	        .and().formLogin();
	    }

}
*/