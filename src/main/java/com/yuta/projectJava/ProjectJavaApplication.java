package com.yuta.projectJava;
import com.yuta.projectJava.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class ProjectJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectJavaApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam.jamalia@gmmail.net",
						LocalDate.of(2000,Month.JANUARY,5),
						21


				)
		);
	}

}
