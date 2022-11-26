package com.example.dorm.controller;

import com.alibaba.fastjson2.JSON;
import com.example.dorm.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class AdminLoginController {

    @Autowired
    AdminService adminService;


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public String AdminLogin(@RequestParam("username") String user, @RequestParam("password") String pwd, Model model, HttpServletRequest req){
        if (!StringUtils.isNumeric(user)){
            model.addAttribute("msg","用户名只能为数字组合");
            return "adminlogin";
        }
        Long id = Long.valueOf(user);
        if (adminService.SelectById(id) == null || !adminService.SelectById(id).getPassword().equals(pwd)){
            model.addAttribute("msg","用户名或密码错误");
        }else {
            HttpSession session = req.getSession();
            session.setAttribute("id",id);
            model.addAttribute("admin",adminService.SelectById(id));
            return "admin/index";
        }
        return "adminlogin";
    }


    @RequestMapping("/adminData")
    @ResponseBody
    public String adminData(HttpServletRequest req){
        return JSON.toJSONString(adminService.SelectById((Long)req.getSession().getAttribute("id")));
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest req){
        req.getSession().invalidate();
        return "adminlogin";
    }
}
