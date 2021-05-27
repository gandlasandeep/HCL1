package DesignPatterns.src.com.hcl.practice.day1;

public class SingleTon {
	 private static SingleTon obj=new SingleTon();//Early, instance will be created at load time  
	 private SingleTon(){}  
	   
	 public static SingleTon getSingleTon(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 
	 }  
	} 


