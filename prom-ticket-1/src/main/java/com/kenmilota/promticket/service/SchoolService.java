package com.kenmilota.promticket.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenmilota.promticket.entity.School;
import com.kenmilota.promticket.repository.SchoolRepository;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolRepository repository;
	
	public School saveSchool(School school) {
		return repository.save(school);
	}
	public List<School> getSchools(){
		return repository.findAll();
	}
	public School getSchoolById(Integer id) {
		return repository.findById(id).orElse(null);
	}
	public void deleteSchool(Integer id) {
		repository.deleteById(id);
	}
	
	public School getSchoolByUserName(String userName) {
		return repository.findByUserName(userName);
	}

}
