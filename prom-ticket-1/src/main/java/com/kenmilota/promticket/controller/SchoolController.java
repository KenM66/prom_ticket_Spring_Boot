package com.kenmilota.promticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kenmilota.promticket.entity.School;
import com.kenmilota.promticket.service.SchoolService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SchoolController {

	@Autowired
	private SchoolService service;
	
	@GetMapping("/schoolById/{userName}")
	public School findSchoolByUserName(@PathVariable String userName) {
		return service.getSchoolByUserName(userName);
	}
	
	@PostMapping("/addSchool")
	public School addSchool(@RequestBody School school) {
		return service.saveSchool(school);
	}
	
}
