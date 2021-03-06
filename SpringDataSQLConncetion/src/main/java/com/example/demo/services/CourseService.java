package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Optional<Course> getCourse(long courseId);
	public void addCourse(Course course);
	public String deleteCourse(long courseId);
	public Course updateCourse(Course course);
	public List<Course> findCourseBySorting(String field);
	public Page<Course> findCourseByPagination(int offset, int pagesize);
	public Page<Course> findCourseByPaginationAndSorting(int offset, int pagesize, String field);
	public List<Course> getFullName();
}
