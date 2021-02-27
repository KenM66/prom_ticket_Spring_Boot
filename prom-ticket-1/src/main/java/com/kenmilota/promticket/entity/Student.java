package com.kenmilota.promticket.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String studentId;
	
	@JsonBackReference
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="school_id", referencedColumnName="id")
	private School school;
	
	private String firstName;
	private String lastName;
	private boolean isRestricted;
	private String restrictedReason;
	private String ticketNumber;
	private String status;
	private int schoolNum;
	
	public int getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(int schoolNum) {
		this.schoolNum = schoolNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isRestricted() {
		return isRestricted;
	}
	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}
	public String getRestrictedReason() {
		return restrictedReason;
	}
	public void setRestrictedReason(String restrictedReason) {
		this.restrictedReason = restrictedReason;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
	
	

}
