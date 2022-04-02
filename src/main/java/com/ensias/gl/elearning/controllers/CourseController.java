package com.ensias.gl.elearning.controllers;

import com.ensias.gl.elearning.dao.CourseRepository;
import com.ensias.gl.elearning.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Courses/*")
public class CourseController {
    @Autowired
    CourseRepository courseRepository ;


    @PostMapping
    public ResponseEntity addCourse(@RequestBody Course course) {
        courseRepository.save(course);
        //test si course existe

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("{idCourse}")
    public ResponseEntity removeCourse(@PathVariable Long idCourse) {
        courseRepository.deleteById(idCourse);
        // test if existe
        return  new ResponseEntity(HttpStatus.GONE);
    }

    @PostMapping
    public ResponseEntity<Course> getCourse(@RequestBody String nomCourse) {

       Course course= courseRepository.findByNomCourse(nomCourse);
       //test if null
        return new ResponseEntity<Course>(course,HttpStatus.FOUND);
    }



    @GetMapping
    public ResponseEntity getCourses() {


        List<Course> courses =courseRepository.findAll();



        return new ResponseEntity<List>(courses,HttpStatus.FOUND);
    }

}
