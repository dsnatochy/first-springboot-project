package com.in28minutes.service;

import org.springframework.stereotype.Component;

// Spring to manage this bean and create an instance
// "Component" annotation notifies Spring that this should be managed by Spring
@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		// Complex method
		return "Good Morning!";
	}

}