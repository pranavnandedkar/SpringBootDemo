package io.boot.start.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseTaken {

	@Id
	private String id;
	private String studentId;
	private String courseId;
	private String score;
	
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public CourseTaken(){
		
	}
	public CourseTaken(String studentId,String courseId){
		this.studentId = studentId;
		this.courseId= courseId;
		
	}
}
