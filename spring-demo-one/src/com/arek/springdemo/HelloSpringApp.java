package com.arek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//�adujemy plik konfiguracyjny XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pobieramy fasolk� z kontenera
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//wywo�ujemy metod�
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//zamykamy context
		context.close();
	}

}
