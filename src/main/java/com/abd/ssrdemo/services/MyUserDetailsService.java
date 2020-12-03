package com.abd.ssrdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.abd.ssrdemo.UserDetailsImpl;
import com.abd.ssrdemo.entity.Auser;
import com.abd.ssrdemo.repos.UserRepo;

public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Auser user = userepo.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User are password are invalid");
		}
		
		return new UserDetailsImpl(user);
	}

}
