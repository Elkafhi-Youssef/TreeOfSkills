package com.skills.treeofskills.service;

import com.skills.treeofskills.dao.StudentDao;
import com.skills.treeofskills.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class StudentServiceImp implements StudentService{
    //    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")// I have used this for @Autowired not working

    @Autowired
    private StudentDao studentDao;
    @Autowired
    public StudentServiceImp(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    private Student student;
    @Override
    public long save(Student student) {
        return 0;
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
    public void update(int id, Student sudent) {

    }

    @Override
    public void delete(int id) {

    }
    @Override
    public String login(String email) {
        this.student = new Student();
        this.student = studentDao.findByEmail("youssefelkafhi@gmail.com");
        return student.getEmail();
    }
}
