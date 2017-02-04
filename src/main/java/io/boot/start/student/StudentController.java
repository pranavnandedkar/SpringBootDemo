package io.boot.start.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/Students")
	public List<Student> allstudent(){
		return studentService.getAllStudents();
	}

	@RequestMapping("/Student/{id}")
	public Student getStudent(@PathVariable String id){
		return studentService.getStudent(id);
	}
	
	@RequestMapping("/StudentWith/{id}")
	public List<Student> getStudentWithCourse(@PathVariable String id){
		return studentService.getAllStudentsWithCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
		
	}
	
}
