package com.nalla.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration

@ComponentScan(basePackages = "com.nalla")
public class MocUtil {

	public MocUtil() {
		System.out.println("container created MocUtil Bean");
	}
	

}
