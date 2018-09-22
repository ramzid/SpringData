package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.persistence.dao.IEmployeeDao;
import com.persistence.model.Employee;
/*
 * dridi.ramzy@gmail.com
 */
public class Main {
public static void main(String[] args) {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext beans = new ClassPathXmlApplicationContext(
				"SpringDataConfig.xml");
		IEmployeeDao employeeDao = (IEmployeeDao) beans.getBean(IEmployeeDao.class);
		 Employee employee = new Employee();
		employee.setName("ramzi");
		employeeDao.save(employee);
	
}
}
