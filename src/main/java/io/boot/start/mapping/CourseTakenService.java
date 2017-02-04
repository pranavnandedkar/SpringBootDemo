package io.boot.start.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.boot.start.student.Student;

@Service
public class CourseTakenService {

	int id = 0 ;
	@Autowired
	private CourseTakenRepository courseTakenRepository;
	
	public List<CourseTaken> getAllCourses(){
		List<CourseTaken> tpcs = new ArrayList<>();
		Iterable<CourseTaken> it = courseTakenRepository.findAll();
		for(CourseTaken t : it){
			tpcs.add(t);
		}
		return tpcs;
		
	}
	
	public List<CourseTaken> getAllCoursesTakenBy(String studentId){
		List<CourseTaken> tpcs = new ArrayList<>();
		Iterable<CourseTaken> it = courseTakenRepository.findAllByStudentId(studentId);
		for(CourseTaken t : it){
			tpcs.add(t);
		}
		return tpcs;
		
	}
	
	
	public CourseTaken findCourseTaken(String studentId,String courseId){
		return courseTakenRepository.findByStudentIdAndCourseId(studentId,courseId);
	}
	public void save(CourseTaken courseTaken) {
		courseTaken.setId("ID"+ ++id );
		courseTakenRepository.save(courseTaken);
		
	}

	public Student courseNotTaken(String id2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student findByName(String id2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeUser(String id2) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> findStudentsWithCourse(String courseId) {
		/***
		 * this Query will be  
		 * select * from CourseTaken where courseId='courseId';
		 */
		return null;
		
	}
}
