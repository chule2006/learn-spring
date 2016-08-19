package com.chuxz.learn.spring.basic;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuxz.learn.spring.entity.Programmer;

public class ProgrammerTest {

	@SuppressWarnings("resource")
	@Test
	public void testCollection(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/bean.xml");
		Programmer programmerA = (Programmer)ctx.getBean("programmerA");
		programmerA.working();
		programmerA.saying();
		Programmer programmerB = (Programmer)ctx.getBean("programmerB");
		programmerB.working();
		Programmer programmerC = (Programmer)ctx.getBean("programmerC");
		programmerC.studing();;
	}
}
	