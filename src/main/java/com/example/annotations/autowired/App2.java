package com.example.annotations.autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
            Employee employee = (Employee) context.getBean("employee", Employee.class);
            Manager manager = (Manager) context.getBean("manager", Manager.class);
            System.out.println(employee.toString());
            System.out.println(manager.toString());
        }


}
