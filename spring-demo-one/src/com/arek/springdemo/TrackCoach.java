package com.arek.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Trzeba ciezko pracowac";
	}

	@Override
	public String getDailyFortune() {
		
		return "Siemka " + fortuneService.getFortune();
	}
	
	//Metoda uruchamiana podczas inicjalizacji
	public void doMyStartupStuff() {
		System.out.println("TrackCoach - jestesmy w startupie");
	}
	
	//Metaoda na onDestroy
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach - jestesmy w destroy");
	}
}
