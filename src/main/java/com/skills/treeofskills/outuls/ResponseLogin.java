package com.skills.treeofskills.outuls;



    public class ResponseLogin {
    private Boolean success;
    private String message;
    private GetStudentLogin student;

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

    public GetStudentLogin getStudent() {
        return student;
    }

    public void setStudent(GetStudentLogin student) {
        this.student = student;
    }
}
