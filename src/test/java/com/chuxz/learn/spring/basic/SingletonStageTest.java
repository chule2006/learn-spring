package com.chuxz.learn.spring.basic;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuxz.learn.spring.entity.SingletonStage;

public class SingletonStageTest {

	@Test
	public void testSingleton(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/bean.xml");
		SingletonStage singletonStage = (SingletonStage) context.getBean("stage");
		singletonStage.perform();
		((ClassPathXmlApplicationContext) context).close();
	}
	
}
