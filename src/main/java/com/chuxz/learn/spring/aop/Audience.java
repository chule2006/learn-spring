package com.chuxz.learn.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}

	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}

	public void applaud() {
		System.out.println("CLAP CLAP CLAP");
	}

	public void demandRefund() {
		System.out.println("Boo! We want money back");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinpoint){
        try{
            System.out.println("begin!");
            long start = System.currentTimeMillis();
            
            joinpoint.proceed();
            
            long end = System.currentTimeMillis();
            System.out.println("end!        performance took "+(end-start)+" milliseconds");
        }catch(Throwable e){
            System.out.println("eee!We want our money back!");
        }
    }
}
