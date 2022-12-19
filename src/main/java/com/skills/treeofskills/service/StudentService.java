package com.skills.treeofskills.service;

import com.skills.treeofskills.model.Student;
import com.skills.treeofskills.outuls.ResponseLogin;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface StudentService {
    long save(Student student);
    Student get(int id);
    List<Student> list();
    void update(int id, Student sudent);
    void delete(int id);

    ResponseLogin login(String email, String password ) throws InvocationTargetException, IllegalAccessException;
}
