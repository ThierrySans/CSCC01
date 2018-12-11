package com.goodhealth.app;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest{
    
    @Test
	@DisplayName("getWelcomeMessage() is not an empty string")
	void welcomeMessageTest() {
    		assertNotEquals("",App.getWelcomeMessage());
	}
}
