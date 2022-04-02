package com.ensias.gl.elearning.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.gl.elearning.webservice.entities.Course;


public interface CourseRepository extends JpaRepository<Course,Long> {
public  Course findByNomCourse(String nomCourse);
}
