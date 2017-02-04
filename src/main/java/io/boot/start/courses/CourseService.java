package io.boot.start.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;



	public List<Course> getAllCourses(){
//		return Courses;
		List<Course> tpcs = new ArrayList<>();
		Iterable<Course> it = courseRepository.findAll();
		for(Course t : it){
			tpcs.add(t);
		}
		return tpcs;
		
	}

	public Course getCourse(String id){
		return courseRepository.findOne(id);

	}

	public void addCourse(Course Course) {
		courseRepository.save(Course);
	}

}
