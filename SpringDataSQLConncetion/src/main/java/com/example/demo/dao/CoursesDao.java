/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Course;

/**
 * @author Training
 *
 */
public interface CoursesDao extends JpaRepository<Course, Long>{

}