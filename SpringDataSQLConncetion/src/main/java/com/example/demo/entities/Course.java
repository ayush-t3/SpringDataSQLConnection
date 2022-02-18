package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name="coursea")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="fullname", procedureName = "getAge1")})
public class Course {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="crsname")
	private String courseName;
	@Column(name="crsdescription")
	private String description;
	
	
	/**
	 * 
	 */
	public Course() {
		super();
	}
	/**
	 * @param id
	 * @param courseName
	 * @param description
	 */
	public Course(long id, String courseName, String description) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", CourseName=" + courseName + ", Description=" + description + "]";
	}
	
	
}
