package com.kenmilota.promticket.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenmilota.promticket.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findBySchoolNum(int schoolNum);
}
