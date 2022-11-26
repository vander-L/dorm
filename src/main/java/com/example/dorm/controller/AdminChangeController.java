package com.example.dorm.controller;

import com.example.dorm.entity.Admin;
import com.example.dorm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminChangeController {


    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/adminChange")
    public String AdminChange(String phone, String pwd, HttpServletRequest req){
        Long id = Long.parseLong(req.getSession().getAttribute("id").toString());
        Admin admin = new Admin();
        admin.setId(id);
        if (!phone.isEmpty()) {
            admin.setPhone(phone);
        }
        if (!pwd.isEmpty()) {
            admin.setPassword(pwd);
        }
        adminService.UpdateById(admin);
        return "redirect:admin/index";
    }
}
