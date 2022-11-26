package com.example.dorm.controller;


import com.example.dorm.entity.Replace;
import com.example.dorm.service.ReplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminChangeDormController {

    @Autowired
    ReplaceService replaceService;


    @RequestMapping( "/admin/changeDorm")
    public String AdminChangeDorm(Model model){
        List<Replace> replaces = replaceService.getChangeDormAll();
        model.addAttribute("changeDorm", replaces);
        return "admin/changedorm";
    }
}
