package com.m3bi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m3bi.model.Course;
import com.m3bi.service.CourseServiceImpl;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	CourseServiceImpl courseserviceImpl;
	
	@GetMapping("/getdata")
	public List<Course> getAllData()
	{
		return courseserviceImpl.getAllData();
	}
	
	@GetMapping("/getdatabyid/{courseId}")
	public Optional<Course> getDataById(@PathVariable int courseId)
	{
		return courseserviceImpl.getDataById(courseId);
	}
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody Course course)
	{
		courseserviceImpl.saveData(course);
		return "Data Saved";
	}
	
	@PutMapping("/updatedata/{courseId}")
	public String updateData(@PathVariable int courseId, @RequestBody Course course)
	{
		courseserviceImpl.updateData(course);
		return "Data Update Successfully";
	}
	
	@DeleteMapping("/deletedata/{courseId}")
	public String deleteData(@PathVariable int courseId )
	{
		courseserviceImpl.deleteData(courseId);
		return "Data deleted Sucessfully";
	}
	
	}
