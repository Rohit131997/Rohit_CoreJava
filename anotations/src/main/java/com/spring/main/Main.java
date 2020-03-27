package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.cofig.appconfig;
import com.spring.drivers.Database;
import com.spring.serives.UserService;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(appconfig.class);

		
		Database mysql = appContext.getBean("mysqlDriver", Database.class);
			
	       
	        
	        System.out.println("MySQL driver info:");
	        System.out.println(mysql.getInfo());

	        System.out.println("UserService Information");
		UserService userService = appContext.getBean(UserService.class);
		System.out.println(userService.getDriverInfo1());

		appContext.close();
		}

}
