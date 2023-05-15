package fr.ledger.homework1.stepsDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;

public class Hooks {
	
	private static final int DEFAULT_SLEEP = 1000;
	
	@Before
	public void initEnv() {
		Configuration.timeout = 6000;
		open("https://react-redux.realworld.io/");
	}
	
	
	@AfterStep
	public void sleepAfew(Scenario scenario){
		sleep(DEFAULT_SLEEP);
	}

}
