package com.m3bi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	private double fees;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(int courseId, String courseName, double fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}
	
	
	
	
}
