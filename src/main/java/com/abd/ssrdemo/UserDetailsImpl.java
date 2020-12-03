package com.abd.ssrdemo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.abd.ssrdemo.entity.Auser;

public class UserDetailsImpl implements UserDetails{

	
	private Auser auser;
	
	public UserDetailsImpl(Auser auser) {
		super();
		this.auser = auser;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String role = auser.getRole();
		System.out.println("---- "+role);
		return Collections.singleton(new SimpleGrantedAuthority(role));
	}

	@Override
	public String getPassword() {
		return auser.getPassword();
	}

	@Override
	public String getUsername() {
		return auser.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
