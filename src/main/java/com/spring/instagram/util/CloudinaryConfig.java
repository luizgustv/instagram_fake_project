package com.spring.instagram.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;

@Service
public class CloudinaryConfig {
	
	public Cloudinary getConfig() {
		
		/*Map config = new HashMap();
		config.put("cloud_name","dildbjrev");
		config.put("api_key", "884276542269511");
		config.put("api_secret", "opdq5gTON4zoZXe7Pd0mWllzmSU");
		Cloudinary cloudinary = new Cloudinary(config);
		*/
		Cloudinary cloudinary = new Cloudinary("cloudinary://884276542269511:opdq5gTON4zoZXe7Pd0mWllzmSU@dildbjrev");
		
		return cloudinary;
	}

}
