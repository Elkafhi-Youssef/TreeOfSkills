package com.skills.treeofskills.outuls;

import com.skills.treeofskills.model.Student;

import java.util.List;

public class ResponceObject {
    private Boolean success;
    private String message;
    private Student student;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
