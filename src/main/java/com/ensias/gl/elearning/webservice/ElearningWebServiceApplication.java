package com.ensias.gl.elearning.webservice;

import com.ensias.gl.elearning.webservice.dao.CourseRepository;
import com.ensias.gl.elearning.webservice.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class ElearningWebServiceApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	@Autowired
	CourseRepository courseRepository;
	public static void main(String[] args) {
		SpringApplication.run(ElearningWebServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Course.class);

    //
    //		Stream.of(
    //				new Course(null,"java",2,"2",new Date(),4),
    //				new Course(null,"java script",2,"2",new Date(),4),
    //				new Course(null,"php",2,"2",new Date(),4)
    //
    //				).forEach(c->courseRepository.save(c));

	}
}
