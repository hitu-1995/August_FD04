package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Manager manager = context.getBean("mgr", Manager.class);
		System.out.println("M-Id : " + manager.getMid());
		System.out.println("M-Project Name : " + manager.getProjectName());
		System.out.println("M-Project Members : " + manager.getMembersInTeam());
		Employee employee = context.getBean("emp", Employee.class);             // 5
		System.out.println(employee.hashCode());
		System.out.println("E-ID : " + employee.getEmpId());
		System.out.println("E-Name : " + employee.getEname());
		System.out.println("E-Address : " + employee.getEaddress());

		Employee employee1 = context.getBean("emp1", Employee.class);

		System.out.println(employee1.hashCode());
		System.out.println("E-ID : " + employee1.getEmpId());
		System.out.println("E-Name : " + employee1.getEname());
		System.out.println("E-Address : " + employee1.getEaddress());
	}
}
