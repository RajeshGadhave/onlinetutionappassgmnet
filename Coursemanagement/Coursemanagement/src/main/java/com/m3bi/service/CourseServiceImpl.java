package com.m3bi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3bi.dao.CourseDaoImpl;
import com.m3bi.model.Course;

@Service
public class CourseServiceImpl {

	@Autowired
	CourseDaoImpl coursedaoImpl;


	public List<Course> getAllData() {
		// TODO Auto-generated method stub
		return coursedaoImpl.getAllData();
	}

	public Optional<Course> getDataById(int courseId) {
		// TODO Auto-generated method stub
		return coursedaoImpl.getDataById(courseId);
	}


	public void saveData(Course course) {
		// TODO Auto-generated method stub
		 coursedaoImpl.saveData(course);
	}


	public void updateData(Course course) {
		// TODO Auto-generated method stub
		coursedaoImpl.updateData(course);
	}


	public void deleteData(int courseId) {
		// TODO Auto-generated method stub
		coursedaoImpl.deleteData(courseId);
	}


	
}
