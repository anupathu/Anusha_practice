package com.nalla.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nalla.model.User;

@Component
@Scope(scopeName)

public class DatabaseInitiaizer {
	@Autowired
	private  User user;
	


	@PostConstruct	
	public void init() {
	
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println("saved user deatils to database");
		
	}

	@PreDestroy
	public void destroy() {
     // just before Spring removes our bean from the application
		System.out.println("Deleted user details");
		
	}
	public void close() {
		System.out.println("before container closed bean is being to destoryed");
	}
}
