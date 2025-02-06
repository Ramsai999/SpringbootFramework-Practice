package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationDatabaseContext.xml");
        UserManager userManagerwithWebserviceProvider = (UserManager) context.getBean("userManagerwithWebserviceProvider");
        UserManager userManagerwithDatabaseProvider = (UserManager) context.getBean("userManagerwithDatabaseProvider");
        System.out.println(userManagerwithWebserviceProvider.getUserInfo());
        System.out.println(userManagerwithDatabaseProvider.getUserInfo());

    }
}
