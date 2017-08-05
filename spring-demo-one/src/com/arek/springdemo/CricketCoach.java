package com.arek.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
	public String getEmailAdress() {
		return emailAdress;
	}



	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
		System.out.println("Jeste�my w setEmail");
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
		System.out.println("Jeste�my w setTeam");
	}



	public CricketCoach() {
		System.out.println("Jeste�my w konstruktorze bezparametrowym :D");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Jeste�my w setFortune");
	}



	@Override
	public String getDailyWorkout() {
		
		return "�wiczonka przez 20 minut";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
