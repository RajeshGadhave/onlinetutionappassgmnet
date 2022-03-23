package com.m3bi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m3bi.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
