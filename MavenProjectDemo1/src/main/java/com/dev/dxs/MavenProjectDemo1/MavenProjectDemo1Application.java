package com.dev.dxs.MavenProjectDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MavenProjectDemo1Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
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





//		SpringApplication.run(MavenProjectDemo1Application.class, args);


	}

}
