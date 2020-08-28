package com.spring.instagram.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cloudinary.utils.ObjectUtils;
import com.spring.instagram.model.Instagram;
import com.spring.instagram.service.InstagramService;
import com.spring.instagram.util.CloudinaryConfig;
import com.spring.instagram.util.GenerateString;

@RestController
public class InstagramController {

	@Autowired
	InstagramService instagramService;
	@Autowired
	CloudinaryConfig cloudinaryConfig;
	@Autowired
	GenerateString gs;
	
	@GetMapping("/")
	public ResponseEntity<List<Instagram>> getAllPosts(){
		List<Instagram> posts = instagramService.findAll();
		return new ResponseEntity<List<Instagram>>(posts, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Instagram> getPosts(@PathVariable(value="id") long id){
		Instagram instagram = instagramService.findById(id);
		return new ResponseEntity<Instagram>(instagram, HttpStatus.OK);
	}
	
	@PostMapping("/upload")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Instagram savePost(@RequestBody Instagram instagram) {
		String randomstring = gs.getRandomString();
		try {
				cloudinaryConfig.getConfig().uploader().upload(instagram.getPathFile(), 
						ObjectUtils.asMap("public_id", randomstring));
				instagram.setPathFile(cloudinaryConfig.getConfig().url().generate(randomstring));
			} catch (IOException e) {
				e.printStackTrace();
			}
		return instagramService.save(instagram);	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Instagram> updateFuncionario(@PathVariable(value="id") long id,  @RequestBody Instagram instagram){
		Instagram upInstagram = instagramService.findById(id);
		upInstagram.setComentario(instagram.getComentario());
		upInstagram.setCurtida(instagram.getCurtida());
		return ResponseEntity.ok(instagramService.save(upInstagram));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePostById(@PathVariable(value = "id") long id){
		instagramService.deleteById(id);
		return ResponseEntity.ok("Post deletado!");
	}
	
	
	
}
