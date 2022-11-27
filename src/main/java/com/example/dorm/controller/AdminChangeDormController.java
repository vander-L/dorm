package com.example.dorm.controller;


import com.example.dorm.entity.Replace;
import com.example.dorm.service.ReplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminChangeDormController {

    @Autowired
    ReplaceService replaceService;


    @RequestMapping( value = "/admin/changeDorm")
    public String AdminChangeDorm(Model model, String agree, String dormId){
        List<Replace> replaces = replaceService.getChangeDormAll();
        model.addAttribute("changeDorm", replaces);
        if (dormId != null) {
            long id = Long.parseLong(dormId);
            Replace replace = replaceService.selectById(id);
            if (agree.equals("同意")){
                replace.setYes("同意");
                replace.setId(id);
                replaceService.updateById(replace);
            } else if (agree.equals("拒绝")) {
                replace.setYes("拒绝");
                replace.setId(id);
                replaceService.updateById(replace);
            }
            return "redirect:changeDorm";
        }
        return null;
    }
}
