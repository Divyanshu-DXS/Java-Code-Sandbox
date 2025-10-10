package com.dev.dxs.MavenProjectDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MavenProjectDemo1Application {

	public static void main(String[] args) {

		SpringApplication.run(MavenProjectDemo1Application.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		// In order to provide and have the init and destroy methods executed in sync with the application we  use configurable Application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

//		Employee dev = context.getBean("employee",Employee.class);
//		System.out.println(dev);
//
//		Employee emp2 = context.getBean("employee2",Employee.class);
//		System.out.println(emp2);
//
//		Employee emp3 = context.getBean("employee3",Employee.class);
//		System.out.println(emp3);


		Employee DXS = context.getBean("divyanshu",Employee.class);
		System.out.println(DXS);

		context.registerShutdownHook(); // ConfigurableApplicationContext provides us with a method to shutdown the context and call the custom method listed.
		









	}

}
