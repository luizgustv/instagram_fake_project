package com.spring.instagram.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.instagram.model.Instagram;
import com.spring.instagram.repository.InstagramRepository;
import com.spring.instagram.service.InstagramService;

@Service
public class InstagramServiceImpl implements InstagramService{

	@Autowired
	InstagramRepository instagramRepository;
	
	@Override
	public List<Instagram> findAll() {
		return instagramRepository.findAll();
	}

	@Override
	public Instagram findById(long id) {
		return instagramRepository.findById(id).get();
	}

	@Override
	public Instagram save(Instagram instagram) {
		return instagramRepository.save(instagram);
	}

	@Override
	public void deleteById(long id) {
		instagramRepository.deleteById(id);
	}


}
