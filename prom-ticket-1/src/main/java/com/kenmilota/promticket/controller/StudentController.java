package com.kenmilota.promticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kenmilota.promticket.entity.Student;
import com.kenmilota.promticket.service.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	@GetMapping("/students")
	public List<Student> findAllStudents(){
		return service.getStudents();
	}
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	@GetMapping("/studentsBySchoolNum/{schoolNum}")
	public List<Student> findStudentBySchoolNum(@PathVariable int schoolNum) {
		return service.getStudentsBySchoolNum(schoolNum);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteById(id);
		
	}
	@GetMapping("/studentById/{id}")
	public Student findStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	

}
