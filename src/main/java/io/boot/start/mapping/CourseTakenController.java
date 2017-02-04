package io.boot.start.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.boot.start.courses.Course;
import io.boot.start.courses.CourseService;

@RestController
public class CourseTakenController {

	@Autowired
	CourseTakenService courseTakenService;
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/CourseNotTaken/{id}")
	public List<Course> getStudent(@PathVariable String id){
		/**
		 * this will have a query in DB which will fetch all the courses taken by student and compare with 
		 * total course which are there in course repo. 
		 */
		
		List<Course> total =	courseService.getAllCourses();
		List<Course> notTaken =	new ArrayList<>();
		for(CourseTaken ct:  courseTakenService.getAllCoursesTakenBy(id) ){
			/*
			 * If this course is not in DB add it to not taken... 
			 * 
			 * */
			
		}
		return notTaken;
		
	}
}
