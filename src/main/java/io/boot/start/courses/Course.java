package io.boot.start.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String descrption;

	public Course(){
		
	}
	public Course(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = desc;
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
}
