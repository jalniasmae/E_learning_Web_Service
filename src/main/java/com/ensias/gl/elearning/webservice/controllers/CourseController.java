package com.ensias.gl.elearning.webservice.controllers;

import com.ensias.gl.elearning.webservice.dao.CourseRepository;
import com.ensias.gl.elearning.webservice.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/courses/*")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @PostMapping(path = "/course")
    public ResponseEntity addCourse(@RequestBody Course course) {
        courseRepository.save(course);
        // test si course existe

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/course/{idCourse}")
    public ResponseEntity<Boolean> removeCourse(@PathVariable Long idCourse) {
        courseRepository.deleteById(idCourse);
        // test if existe
        return new ResponseEntity(true,HttpStatus.ACCEPTED);
    }

    @GetMapping("/course/{nomCourse}")
    public ResponseEntity<Course> getCourse(@PathVariable(value="nomCourse")  String nomCourse) {

        Course course = courseRepository.findByNomCourse(nomCourse);
        // test if null
        return new ResponseEntity<Course>(course, HttpStatus.FOUND);
    }

    @GetMapping("/all")
    public ResponseEntity<List> getCourses() {

        List<Course> courses = courseRepository.findAll();

        return new ResponseEntity<List>(courses, HttpStatus.FOUND);
    }

}
