package com.samples.springcoredi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/springcoredi/SpringConfig.xml");
       
       Employee emp = (Employee) springContainer.getBean("emp"); 
       System.out.println(emp);
      // Hospital hospital = (Hospital) springContainer.getBean("hospital");
       //System.out.println(hospital);
      // Customer customer = (Customer) springContainer.getBean("customer");
      // System.out.println(customer);
      // Shoppingcart sc = (Shoppingcart) springContainer.getBean("shoppingcart");
     //  System.out.println(sc);
//       AbstractApplicationContext springContainer1 = new ClassPathXmlApplicationContext("com/samples/springcoredi/SpringConfig.xml");
//   	Patient patient = (Patient) springContainer1.getBean("patient");
//   	System.out.println(patient);
//   	springContainer1.registerShutdownHook();
    }
}
