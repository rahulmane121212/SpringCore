package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

    public static void main(String[] args) {

        System.out.println("Enter Details: ");

        ApplicationContext ref = new ClassPathXmlApplicationContext("Config.xml");
        Customer customer = (Customer)ref.getBean("custome");
        System.out.println(customer);
        
        
    }

    
}