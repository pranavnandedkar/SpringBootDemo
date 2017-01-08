package io.boot.start.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String descrption;

	public Topic(){
		
	}
	public Topic(String id, String name, String desc) {
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
