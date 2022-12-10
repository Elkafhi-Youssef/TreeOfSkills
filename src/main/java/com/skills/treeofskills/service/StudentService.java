package com.skills.treeofskills.service;

import com.skills.treeofskills.model.Book;
import com.skills.treeofskills.model.Student;

import java.util.List;

public interface StudentService {
    long save(Student student);
    Student get(int id);
    List<Student> list();
    void update(int id, Student sudent);
    void delete(int id);

    String login(String email );
}
