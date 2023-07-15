package com.yuta.projectJava.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

////// in N-Tier Architecture in SpringBoot //////
//
// Controller / API layer
// Service Layer            <-- THIS FILE
// Data Access Layer
//////////////////////////////////////////////////

// In Java, the term "bean" is often used to refer to a Java object
// that conforms to certain conventions and guidelines.
// A bean is a class that is designed to be reusable, serializable,
// and easily manipulated in an application development environment,
// particularly in the context of JavaBeans.

// JavaBeans is a component architecture for building reusable software components in Java.
// It defines a set of rules and conventions that enable the construction of reusable,
// customizable, and visually manipulable components. Beans are the fundamental building blocks of JavaBeans.

// @Component <- use this to 'connect' StudentService with StudentController
// but in Springboot, there are more specific types of @Components, like @Service:
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamalia@gmmail.net",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}

