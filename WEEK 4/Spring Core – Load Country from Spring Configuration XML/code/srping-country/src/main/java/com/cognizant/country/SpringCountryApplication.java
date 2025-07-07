package com.cognizant.country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCountryApplication {

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        System.out.println("Country: " + country.toString());
    }

    public static void main(String[] args) {
        displayCountry();
    }
}
