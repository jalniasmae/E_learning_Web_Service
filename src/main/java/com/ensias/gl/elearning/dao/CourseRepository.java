package com.ensias.gl.elearning.dao;

import com.ensias.gl.elearning.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
public  Course findByNomCourse(String nomCourse);
}
