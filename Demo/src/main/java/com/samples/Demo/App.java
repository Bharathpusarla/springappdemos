package com.samples.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	
		Bike obj = new Bike();
		obj.drive();
		
//		 ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/Demo/spring.xml");
//		Vehicle obj = (Vehicle) springContainer.getBean("vehicle");
//		obj.drive();

	}
}
