package com.learn;

public class TeamLead implements Tasks {

	@Override
	public String makeTestCase() {
		return"You have 2 hours to make it all";
	}

	@Override
	public String writeScriptForSelenium() {
		return "Make for firefox";
	}
	
}
