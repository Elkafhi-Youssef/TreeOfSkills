package com.skills.treeofskills.service;

import com.skills.treeofskills.dao.StudentDao;
import com.skills.treeofskills.model.Student;
import com.skills.treeofskills.outuls.GetStudentLogin;
import com.skills.treeofskills.outuls.ResponseLogin;
import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
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
    public ResponseLogin login(String email, String password) throws InvocationTargetException, IllegalAccessException {
        ResponseLogin response = new ResponseLogin();
        GetStudentLogin studentinfo = new GetStudentLogin();
        this.student = new Student();
        this.student = studentDao.findByEmail(email);
        if (this.student != null) {
            Hibernate.initialize(this.student.getSkills());
            BeanUtils.copyProperties(studentinfo, this.student);
            if (this.student.getPassword().equals(password)){
                response.setSuccess(true);
                response.setMessage("login successful");
                response.setStudent(studentinfo);
                return response;
            }else {
                response.setSuccess(false);
                response.setMessage("password incorrect");
                return response;
            }
        }else {
            System.out.println("email not found");
            response.setSuccess(false);
            response.setMessage("the email does not exist");
            return response;}
    }
}
