package com.example.dorm.controller;

import com.example.dorm.entity.Repair;
import com.example.dorm.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RepairController {
    @Autowired
    RepairService repairService;

    @RequestMapping(value = "torepair")
    public String repair(String name, String num, String dorm1, String dorm2, String type, String reason, String note, String time, HttpServletRequest req){
        Repair repair = new Repair();
        Long id = Long.parseLong(req.getSession().getAttribute("id").toString());
        repair.setNote(note);
        repair.setReason(reason);
        repair.setType(type);
        repair.setTime(time);
        repair.setName(name);
        repair.setPhone(Integer.parseInt(num));
        return null;
    }
}
