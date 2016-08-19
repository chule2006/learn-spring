package com.chuxz.learn.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuxz.learn.spring.entity.Person;

public class testDI {
    public static void main(String[] args){
        @SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/bean.xml");
        Person p = (Person) ctx.getBean("person",Person.class);
        p.info();
        p.setAge(20);
        p.info();
    }
}