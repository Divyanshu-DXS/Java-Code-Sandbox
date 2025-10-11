package com.dev.dxs.MavenProjectDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = "com.dev.dxs.MavenProjectDemo1")
public class MavenProjectDemo1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context1 = SpringApplication.run(MavenProjectDemo1Application.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		// In order to provide and have the init and destroy methods executed in sync with the application we  use configurable Application context
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


//		Employee dev = context.getBean("employee",Employee.class);
//		System.out.println(dev);
//
//		Employee emp2 = context.getBean("employee2",Employee.class);
//		System.out.println(emp2);
//
//		Employee emp3 = context.getBean("employee3",Employee.class);
//		System.out.println(emp3);


//		Employee DXS = context.getBean("divyanshu",Employee.class);
//		System.out.println(DXS);
//		context.registerShutdownHook(); // ConfigurableApplicationContext provides us with a method to shutdown the context and call the custom method listed.

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.dev.dxs.MavenProjectDemo1.Config","ExternalConfigFolder");
		Profession getProfessionBean = context.getBean(Profession.class);
		System.out.println(getProfessionBean.yourProfession("Software architect"));
		getProfessionBean.setJobRole("Software architect");
		Employee dev = context.getBean("getDev",Employee.class);
		System.out.println(dev);
		Employee alex = context.getBean("getAlex",Employee.class);
		System.out.println(alex);

		CompanyData comp1 = context.getBean("getCompany1",CompanyData.class); // attempting AnnotationConfigApplicationContext to pick up multiple files in the listed location
		System.out.println(comp1);

		// attempting, to use an external file for AnnotationConfigApplicationContext
		CompanyData comp2 = context.getBean("getCompanyData2",CompanyData.class);
		System.out.println(comp2);

		Student student= context1.getBean(Student.class);
		student.takeAction();

		// making another container with xml based configuration

		ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext("bean.xml");

		Game apexLegends = context2.getBean("ApexLegends", Game.class);
		Game fifa = context2.getBean("Fifa",Game.class);
		System.out.println(apexLegends);
		System.out.println(fifa);

	}

}
