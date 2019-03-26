package com.rev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		EmployeeDao employee = (EmployeeDao) context.getBean("employeedao");
		employee.byPreparedStatement(new Employee(101,"saravanan",22000));
	}

}
