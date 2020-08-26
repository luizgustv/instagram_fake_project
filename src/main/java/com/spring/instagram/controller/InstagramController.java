package com.spring.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.instagram.model.Instagram;
import com.spring.instagram.service.InstagramService;
import com.spring.instagram.util.InstagramUtil;

@RestController
public class InstagramController {

	@Autowired
	InstagramService instagramService;
	
	@GetMapping("/")
	public ResponseEntity<List<Instagram>> getAllPosts(){
		List<Instagram> posts = instagramService.findAll();
		return new ResponseEntity<List<Instagram>>(posts, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Instagram> getPosts(@PathVariable(value="id") int id){
		
		String pathFile = "D:\\\\Projetos\\\\Programacao\\\\Java\\\\instagram\\\\src\\\\main\\\\resources\\\\static\\\\decodedImage.jpg";
		
		InstagramUtil instagramUtil = new InstagramUtil();
		Instagram instagram = instagramService.findById(id);
		
		instagramUtil.decoder(instagram.getFile(), pathFile);
		
		return new ResponseEntity<Instagram>(instagram, HttpStatus.OK);
	}
	
	@PostMapping("/upload")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Instagram saveFuncionario(@RequestBody Instagram instagram) {
		
		Instagram uploadFIle = new Instagram(); 
		
		InstagramUtil instagramUtil = new InstagramUtil();
				
		uploadFIle.setFile(instagramUtil.encoder(instagram.getPathFile()));
		
		return instagramService.save(uploadFIle);	
	}
	
	
	
}
