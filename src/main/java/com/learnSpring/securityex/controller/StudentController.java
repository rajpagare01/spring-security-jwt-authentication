package com.learnSpring.securityex.controller;

import com.learnSpring.securityex.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/")
public class StudentController {
    private List<Student> students= new ArrayList<>(List.of(new Student(1 , "Raj" , 85) ,
            new Student(2 , "Pagare", 90) , new Student(3 , "Aman" , 78) , new Student(4 , "Suman" , 88)));


     @GetMapping("/students")
 public List<Student> getStudents(){
return students;
 }
 @GetMapping("/csrf-token")
 public CsrfToken getCsrfToken(HttpServletRequest request)
 {
     return (CsrfToken) request.getAttribute("_csrf");
 }


 @PostMapping("/students")
 public Student  addStudent(@RequestBody Student student){
         students.add(student);
         return student;
 }

}
