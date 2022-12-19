package com.skills.treeofskills.controller;

import com.skills.treeofskills.model.Student;
import com.skills.treeofskills.outuls.ResponseLogin;
import com.skills.treeofskills.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {


    private StudentService studentService;


    @Autowired
    public AuthController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseLogin> login(@RequestBody Student data) throws InvocationTargetException, IllegalAccessException {

//        ResponseLogin res= new ResponseLogin();
        ResponseLogin res = studentService.login(data.getEmail(),data.getPassword());
        return new ResponseEntity<>(res, HttpStatus.OK);

//            if (student != null) {
//                System.out.println("Done!");
//                response.setSuccess(true);
//                response.setMessage("login successful");
//                response.setStudent(student);
//                return new ResponseEntity<>(response, HttpStatus.OK);
//            }else {
//                System.out.println("something wrong!");
//                response.setSuccess(false);
//                response.setMessage("error login");
//                response.setStudent(student);
//                return new ResponseEntity<>(response, HttpStatus.OK);
//            }

    }
}
