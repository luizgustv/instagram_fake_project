package com.spring.instagram.service;

import java.util.List;

import com.spring.instagram.model.Instagram;

public interface InstagramService {
	
	List<Instagram> findAll();
	Instagram findById(int id);
	Instagram save(Instagram instagram);
	
}
