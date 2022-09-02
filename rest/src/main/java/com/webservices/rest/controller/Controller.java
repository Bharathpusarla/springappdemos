package com.webservices.rest.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.rest.model.RestUser;

@RestController
@RequestMapping("/users")
public class Controller {
	
	Map<String,RestUser> allusers = new HashMap<>();
	@GetMapping
	public  Collection<RestUser>getmethod() {
		return allusers.values();
	}
	@PostMapping
	public String postmethod(@RequestBody RestUser Userdetails) {
		RestUser addValue = new RestUser();
		addValue.setUserId(Userdetails.getUserId());
		addValue.setName(Userdetails.getName());
		addValue.setEmail(Userdetails.getEmail());
		allusers.put(Userdetails.getUserId(),addValue);
		return "user added";
		
	}
	@PutMapping(path="/{userId}")
	public String putmethod(@PathVariable String userId,@RequestBody RestUser Userdetails) {
		if(allusers.containsKey(userId)) {
			RestUser addValue = new RestUser();
			addValue.setUserId(Userdetails.getUserId());
			addValue.setName(Userdetails.getName());
			addValue.setEmail(Userdetails.getEmail());
			allusers.put(Userdetails.getUserId(),addValue);
			return "updated done";
		}
		else {
		return "id not found";
		}	
		
	}
	@DeleteMapping(path="/{userId}")
    public String deletemethod(@PathVariable String userId) {
		if(allusers.containsKey(userId)) {
			allusers.remove(userId);
			return "User deletd";
		}else {
	return "UserId not found";
		}
	
}
}
