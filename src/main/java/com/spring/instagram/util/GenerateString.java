package com.spring.instagram.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class GenerateString {
	
	public String getRandomString() {
		UUID uuid = UUID.randomUUID();
		String randomString = uuid.toString();
		return randomString.substring(0,10);
	}

}
