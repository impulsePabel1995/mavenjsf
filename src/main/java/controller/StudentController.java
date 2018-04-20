package controller;

import javax.faces.bean.ManagedBean;
import data.model.*;
@ManagedBean(name = "StudentController")
public class StudentController {
  private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String isNext(){
        return "success";
  }
}
