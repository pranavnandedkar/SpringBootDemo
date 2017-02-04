package io.boot.start.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.boot.start.mapping.CourseTaken;
import io.boot.start.mapping.CourseTakenService;


@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Autowired
	private CourseTakenService courseTakenService; 
	
	Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
		   String StudentName1 = s1.getName().toUpperCase();
		   String StudentName2 = s2.getName().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		  
	    }};

	    public List<Student> getAllStudentsWithCourse(String courseId){
//			return Students;
			ArrayList<Student> tpcs = new ArrayList<>();
			List<Student> it = courseTakenService.findStudentsWithCourse(courseId);
			
			
			for(Student t : it){
				tpcs.add(t);
			}
			
			
			   Collections.sort(tpcs, StuNameComparator);
			return tpcs;
			
		}
	    
	public List<Student> getAllStudents(){
//		return Students;
		ArrayList<Student> tpcs = new ArrayList<>();
		Iterable<Student> it = studentRepository.findAll();
		for(Student t : it){
			tpcs.add(t);
		}
		
		
		   Collections.sort(tpcs, StuNameComparator);
		return tpcs;
		
	}

	public boolean remove(String id){
		studentRepository.delete(id);
		courseTakenService.removeUser(id);
		return true;
	}
	public Student getStudent(String id){
		return studentRepository.findOne(id);

	}

	public void addStudent(Student student) {
		studentRepository.save(student);
		for(String courseID : student.getCourses()){
			courseTakenService.save(new CourseTaken(student.getId(),courseID));
		}
	}
}
