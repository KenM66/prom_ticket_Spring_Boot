package com.kenmilota.promticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenmilota.promticket.entity.Student;
import com.kenmilota.promticket.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> getStudents(){
		return repository.findAll();
	}
	public Student updateStudent(Student student) {
		Student existingStudent= repository.findById(student.getId()).orElse(null);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setRestricted(student.isRestricted());
		existingStudent.setRestrictedReason(student.getRestrictedReason());
		existingStudent.setTicketNumber(student.getTicketNumber());
		existingStudent.setStatus(student.getStatus());
		return repository.save(existingStudent);
	}
	
	public List<Student> getStudentsBySchoolNum(int schoolNum) {
		return repository.findBySchoolNum(schoolNum);
	}
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Student "+id+" has been removed from the database";
	}
}
