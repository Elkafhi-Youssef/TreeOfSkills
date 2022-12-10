package com.skills.treeofskills.dao;

import com.skills.treeofskills.model.Book;
import com.skills.treeofskills.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImp implements StudentDao{
    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private Student student;

    @Override
    public long save(Student student) {
        sessionFactory.getCurrentSession().persist(student);
        return student.getStudentId();
    }

    @Override
    public Student get(int id) {
        return null;
    }

    @Override
    public List<Student> list() {
        return null;
    }

    @Override
    public void update(int id, Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student findByEmail(String email) {
        student = (Student) sessionFactory.getCurrentSession().createQuery("select s from Student s where email= :email" , Student.class).list();
        return student;
    }
}
