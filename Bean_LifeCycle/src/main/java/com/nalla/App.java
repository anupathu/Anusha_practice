package com.nalla;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nalla.service.DatabaseInitiaizer;
import com.nalla.util.MocUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);

		DatabaseInitiaizer d = (DatabaseInitiaizer) container.getBean(DatabaseInitiaizer.class);
		System.out.println(d.hashCode());
         d.close();
		DatabaseInitiaizer dd = (DatabaseInitiaizer) container.getBean(DatabaseInitiaizer.class);
		System.out.println(dd.hashCode());
		   dd.close();
		container.close();

	}
}
