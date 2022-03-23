package com.m3bi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m3bi.model.Course;
import com.m3bi.repo.CourseRepo;

@Component
public class CourseDaoImpl {


	@Autowired
	CourseRepo courserepoImpl;

	public List<Course> getAllData() {
		// TODO Auto-generated method stub
		return courserepoImpl.findAll();
	}

	public Optional<Course> getDataById(int courseId) {
		// TODO Auto-generated method stub
		return courserepoImpl.findById(courseId);
	}
	public void saveData(Course course) {
		// TODO Auto-generated method stub
		courserepoImpl.save(course);
	}

	public void updateData(Course course) {
		// TODO Auto-generated method stub
		courserepoImpl.save(course);
	}

	public void deleteData(int courseId) {
		// TODO Auto-generated method stub
		courserepoImpl.deleteById(courseId);
	}

	

	
	
}
