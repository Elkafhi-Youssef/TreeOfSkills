package com.skills.treeofskills.controller;


import com.skills.treeofskills.model.Book;
import com.skills.treeofskills.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public ResponseEntity<?> save(@RequestBody Book book) {
        String emailreturned = studentService.login("youssefelkafhi@gmail.com");
        return ResponseEntity.ok().body("New Book has been saved with ID:" + emailreturned);
    }
}
