package com.chuxz.learn.spring.annotation;

public class SayHiElement {
	
	public void sayHiDefault(String name){
		System.out.println("say hi " + name);
	}
	
	@SayHiAnnotation(paramValue="rose")
	public void sayHiAnnotation(String paramValue){
		System.out.println("say hi " + paramValue);
	}
	
	@SayHiAnnotation
	public void sayHiAnnotationDefault(String paramValue){
		System.out.println("say hi "+ paramValue);
	}

}
