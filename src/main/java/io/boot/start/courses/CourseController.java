package io.boot.start.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/Courses")
	public List<Course> allCourses(){
		return CourseService.getAllCourses();
	}

	@RequestMapping("/Courses/{id}")
	public Course getCourse(@PathVariable String id){
		return CourseService.getCourse(id);
	}
	
	@RequestMapping("/CoursesName/{name}")
	public Course getCourseByName(@PathVariable String name){
		return CourseService.getCourse(name);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Courses")
	public void addCourse(@RequestBody Course Course){
		CourseService.addCourse(Course);
		System.out.println("Course Added "+Course.getName());
		
	}
	
}
