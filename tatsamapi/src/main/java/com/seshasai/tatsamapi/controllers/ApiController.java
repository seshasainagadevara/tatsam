package com.seshasai.tatsamapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seshasai.tatsamapi.entities.Areas;
import com.seshasai.tatsamapi.entities.PriorityArea;
import com.seshasai.tatsamapi.entities.User;
import com.seshasai.tatsamapi.services.PriorityService;

@RestController
public class ApiController {
	
	@Autowired
	private PriorityService priorityService;
	
	@GetMapping("/")
	public String initial() { 
		return "Welcome to tatsam";
		
	};
	
	//returns list of available priorities
	@GetMapping("/areas")
	public List<Areas> getPriorities(){
		return this.priorityService.getPriorityAreas();
	}
	
	@GetMapping("/MyProfile/{userID}")
	public List<PriorityArea> getMyPriority(@PathVariable String userID) {
		
		return this.priorityService.getMyPriority(userID);
		
	}
	
	@PostMapping(path = "/add", consumes = "application/json")
	public List<PriorityArea> addPriority(@RequestBody User user){
		return this.priorityService.addPriority(user).getPriorities();
		
		
	}

	
}
