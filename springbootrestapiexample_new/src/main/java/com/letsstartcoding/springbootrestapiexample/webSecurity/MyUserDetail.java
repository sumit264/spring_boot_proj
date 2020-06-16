/*package com.letsstartcoding.springbootrestapiexample.webSecurity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class MyUserDetail implements UserDetails{
	
	
	private String userName;

	private String password;

	private boolean active;
	

	private List<GrantedAuthority> authorities;
	

	public MyUserDetails(String userName) {
		
		this.userName=userName;
	}
	
public MyUserDetail(User user) {
	System.out.println("============================7============================");
		this.userName=user.getUserName();
		this.password=user.getPassword();
		this.active=user.isActive();
		this.authorities=Arrays.stream(user.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}

	public MyUserDetail() {
		
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		System.out.println(authorities);
		return authorities;
	}

	@Override
	public String getPassword() {
		System.out.println(password);
		return password;
	}

	@Override
	public String getUsername() {
		
		System.out.println(userName);
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
*/