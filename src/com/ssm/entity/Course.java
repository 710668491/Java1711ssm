package com.ssm.entity;

public class Course {
	private Integer id;
	private String name;
	private Integer credit;
	
	
	public Course(String name) {
		super();
		this.name = name;
	}



	public Course() {
		super();
	}



	public Course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "course [id=" + id + ", name=" + name + "]";
	}
	
	
	

	

	
	

	
}
