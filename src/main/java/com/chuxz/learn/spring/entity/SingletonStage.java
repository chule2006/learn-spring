package com.chuxz.learn.spring.entity;

/**
 * singleton instance
 * @author chu
 *
 */
public class SingletonStage {

	/**
	 * static innor class
	 */
	private static class SingletonStageHolder{
		
		static SingletonStage instance= new SingletonStage();
	}
	
//	private SingletonStage(){
//		
//	}
	
	public static SingletonStage getInstance(){
	 return SingletonStageHolder.instance;	
	}
	
	public void perform(){
		System.out.println("perform begin");
	}
	
	public void turnOnLight() {
		System.out.println("before perform, turn on light");
	}
		
	public void turnOffLight(){
		System.out.println("after perform, turn off light");
	}
	
}
