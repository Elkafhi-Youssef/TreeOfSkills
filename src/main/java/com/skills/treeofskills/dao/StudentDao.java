package com.skills.treeofskills.dao;

import com.skills.treeofskills.model.Student;

import java.util.List;

public interface StudentDao {
    long save(Student student);

    Student get(int id);

    List<Student> list();

    void update(int id, Student student);

    void delete(int id);

    Student findByEmail(String email);
}
