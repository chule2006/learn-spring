package com.chuxz.learn.spring.aop;

public class Magician implements MindReader{

	private String thoughts;
    public void interceptThoughts(String thougths) {
        System.out.println("Intercepting volunteer's thoughts");
        System.out.println(thougths);
        this.thoughts = thougths;
    }
    public String getThoughts() {
        return thoughts;
    }
}
