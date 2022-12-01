package com.example.dorm.controller;


import com.example.dorm.entity.Student;
import com.example.dorm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ChangeController {

    @Autowired
    StudentService studentService;

    @RequestMapping( value = "/tochange")
    public String change(String phone, String email, String pwd, String school, String desc, HttpServletRequest req, HttpServletResponse resp){
        Long id = Long.parseLong(req.getSession().getAttribute("id").toString());
        Student student = new Student();
        student.setId(id);
        if (!desc.isEmpty()) {
            student.setFeedback(desc);
        }
        if(!email.isEmpty()) {
            student.setEmail(email);
        }
        if(!school.isEmpty()) {
            student.setSchool(school);
        }
        if(!phone.isEmpty()) {
            student.setPhone(phone);
        }
        if(!pwd.isEmpty()) {
            student.setPassword(pwd);
        }
//        System.out.println(student);
        studentService.UpdateById(student);
        return "student/index";
    }


}
