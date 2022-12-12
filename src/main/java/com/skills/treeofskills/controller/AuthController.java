package com.skills.treeofskills.controller;

import com.skills.treeofskills.service.StudentService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {


    private StudentService studentService;

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    public AuthController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/login")
    public ResponseEntity<?> login() {
            String emailreturned = studentService.login("youssefelkafhi@gmail.com");
            return ResponseEntity.ok().body("New Book has been saved with ID:" + emailreturned);
    }
}
