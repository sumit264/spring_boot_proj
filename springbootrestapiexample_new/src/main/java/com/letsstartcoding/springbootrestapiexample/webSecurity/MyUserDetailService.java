/*package com.letsstartcoding.springbootrestapiexample.webSecurity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
System.out.println("===========================6============================"+username);
		
		Optional<User> user= userRepository.findByUserName(username);
		
		System.out.println("=======9======="+user);
		
		user.orElseThrow(() -> new UsernameNotFoundException("NOT FOUND" + username));
		
		return user.map(MyUserDetail::new).get();
	
	}

}
*/