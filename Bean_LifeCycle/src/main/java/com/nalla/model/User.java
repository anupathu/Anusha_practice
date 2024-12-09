package com.nalla.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@component
public class User {
	@Value(value = "123")
	private Integer id;
	@Value(value = "naresh")
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
