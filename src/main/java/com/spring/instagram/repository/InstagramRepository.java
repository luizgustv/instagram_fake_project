package com.spring.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.instagram.model.Instagram;

public interface InstagramRepository extends JpaRepository<Instagram, Long>{

}
