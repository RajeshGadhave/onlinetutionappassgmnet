package com.m3bi.dao.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.experimental.max.CouldNotReadCoreException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.m3bi.dao.CourseDaoImpl;
import com.m3bi.model.Course;
import com.m3bi.repo.CourseRepo;



@SpringBootTest
@RunWith(SpringRunner.class)
public class CourseDaoImplTest {


		@Autowired
		CourseDaoImpl courseDaoImpl;

		@MockBean
		CourseRepo courserepoImpl;

		@Test
		public void getAllDataTest() {
			when(courserepoImpl.findAll()).thenReturn(
					Stream.of(new Course(11, "Java", 9632.55), new Course(12, "OOP", 563.86)).collect(Collectors.toList()));

			assertEquals(2, courseDaoImpl.getAllData().size());
		}

		@Test
		public void getDataByidTest() {
			
			

			Course course = new Course(2, "Python", 4866.52);
			courseDaoImpl.getDataById(2);
			verify(courserepoImpl, times(1)).findById(2);
			}
		
		@Test
		public void saveDataTest() {
			Course course = new Course(21, "Mysql", 8963.54);
			courseDaoImpl.saveData(course);
			verify(courserepoImpl, times(1)).save(course);
		}

		@Test
		public void updateDataTest() {

			Course course = new Course(21, "Mysql", 8963.54);
			courseDaoImpl.saveData(course);
			verify(courserepoImpl, times(1)).save(course);
		}

		@Test
		public void deleteDataTest()
		{
			Course course = new Course(100, "Python", 8756.52);
			courseDaoImpl.deleteData(100);
			verify(courserepoImpl, times(1)).deleteById(100);
		}
		
			

}
