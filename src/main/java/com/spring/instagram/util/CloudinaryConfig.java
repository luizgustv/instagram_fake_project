package com.spring.instagram.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cloudinary.Cloudinary;

@Component
public class CloudinaryConfig {
	
	public Cloudinary getConfig() {
		
		Map config = new HashMap();
		config.put("cloud_name", "dildbjrev");
		config.put("api_key", "884276542269511");
		config.put("api_secret", "opdq5gTON4zoZXe7Pd0mWllzmSU");
		Cloudinary cloudinary = new Cloudinary(config);
		
		return cloudinary;
	}

}
