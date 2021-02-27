package com.kenmilota.promticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenmilota.promticket.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
	
	School findByUserName(String userName);

}
