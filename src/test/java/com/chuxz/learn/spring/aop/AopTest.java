package com.chuxz.learn.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuxz.learn.spring.aop.Thinker;
import com.chuxz.learn.spring.entity.Instrumentalist;

public class AopTest {

	@SuppressWarnings("resource")
	@Test
	public void aopTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/aop-bean.xml");
		Instrumentalist performer = (Instrumentalist)ctx.getBean("kenny");
        performer.perform();
	}
	@SuppressWarnings("resource")
	@Test
	public void aopWithParaTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/aop-bean.xml");
		Thinker think = (Thinker)ctx.getBean("volunteer");
		think.thinkOfSomething("i am thinking");
	}
}
