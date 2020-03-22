package com.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationSupport.xml");
		
		Tasks myDailyTasks = context.getBean("MyTasks", Tasks.class);
		
		System.out.println(myDailyTasks.writeScriptForSelenium());
		
		context.close();
	}
}
