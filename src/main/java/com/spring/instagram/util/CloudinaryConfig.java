package com.spring.instagram.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;

@Service
public class CloudinaryConfig {
	
	public Cloudinary getConfig() {
		
		Cloudinary cloudinary = new Cloudinary("cloudinary://api_key:api_secret@cloud_name");
		
		return cloudinary;
	}

}
