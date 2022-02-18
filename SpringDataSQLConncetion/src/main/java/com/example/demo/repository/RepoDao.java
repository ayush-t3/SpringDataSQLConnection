package com.example.demo.repository;
import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apiExample.restApiSpring.entities.Course;

@Repository

public class RepoDao {
	
@Autowired
private EntityManager eManager;


@SuppressWarnings("unchecked")
public List<com.example.demo.entities.Course> getFullName(){
	return eManager.createNamedStoredProcedureQuery("fullname").getResultList();
}


}
