package com.lindovaldo.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lindovaldo.crudspring.model.CourseModel;
import com.lindovaldo.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {

		return args -> {
			courseRepository.deleteAll();

			CourseModel c = new CourseModel();
			c.setName("angular com spring");
			c.setCategory("front-end");

			courseRepository.save(c);
		};
	}

}
