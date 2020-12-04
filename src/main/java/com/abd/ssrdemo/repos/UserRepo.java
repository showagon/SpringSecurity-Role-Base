package com.abd.ssrdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abd.ssrdemo.entity.Auser;

public interface UserRepo extends JpaRepository<Auser,Integer>{

	//@Query("select u from Auser u where u.username = :username")
	//public Auser findByUsername(@Param("username") String username);
	Auser findByUsername(String username);
}
