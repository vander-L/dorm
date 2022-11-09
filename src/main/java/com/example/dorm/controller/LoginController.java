package com.example.dorm.controller;



import com.alibaba.fastjson2.JSON;
import org.apache.commons.lang3.StringUtils;
import com.example.dorm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String user, @RequestParam("password") String pwd, Model model, HttpServletRequest req){
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
            model.addAttribute("stu",studentService.SelectById(id));
            return "student/index";
        }
        return "login";
    }

    @RequestMapping("/stuData")
    @ResponseBody
    public String stuData(HttpServletRequest req){
        return JSON.toJSONString(studentService.SelectById((Long)req.getSession().getAttribute("id")));
    }

    @PostMapping ("/logout")
    public String logout(HttpServletRequest req){
        req.getSession().invalidate();
        return "login";
    }

}
