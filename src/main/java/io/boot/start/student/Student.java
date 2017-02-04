package io.boot.start.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student  {

	@Id
	private String id;
	private String name;
	private String[] courses;
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	private String descrption;

	public Student(){
		
	}
	public Student(String id, String name, String desc,String[] courses) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = desc;
		this.courses=courses;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return descrption;
	}
	public void setDesc(String desc) {
		this.descrption = desc;
	}
	@Override
	public String toString(){
		return name;
	}
}
