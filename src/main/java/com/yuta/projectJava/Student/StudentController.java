package com.yuta.projectJava.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")

////// in N-Tier Architecture in SpringBoot //////
//
// Controller / API layer <-- THIS FILE
// Service Layer
// Data Access Layer
//////////////////////////////////////////////////
public class StudentController {
    private final StudentService studentService;

    // @Autowired allows for dependenct injection. (that the StudentService is automatically instantiated in the proceeding code
    @Autowired
    public StudentController(StudentService studentService){
        // the following is improper, because it does not comform to
        // dependency injection:
        //           this.studentService = new StudenService()
        // (a design pattern of providing the dependencies of a class
        // from an external source, rather than having the class create or manage its dependencies internally.)

        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
