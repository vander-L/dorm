package com.example.dorm.controller;


import com.example.dorm.entity.Student;
import org.apache.commons.lang3.StringUtils;
import com.example.dorm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String user,@RequestParam("password") String pwd, Model model, HttpServletRequest req){
        System.out.println(user);
        if (!StringUtils.isNumeric(user)){
            model.addAttribute("msg","用户名只能为数字组合");
            return "login";
        }
        Long id = Long.valueOf(user);
        if (studentService.SelectById(id) == null || !studentService.SelectById(id).getPassword().equals(pwd)){
            model.addAttribute("msg","用户名或密码错误");
        }else {
            HttpSession session = req.getSession();
            session.setAttribute("id",id);
            model.addAttribute("id",id);

            return "index";
        }
        return "login";
    }

}
