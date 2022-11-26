package com.example.dorm.controller;

import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Repair;
import com.example.dorm.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class RepairController {
    @Autowired
    RepairService repairService;

    @RequestMapping(value = "/toRepair")
    public String repair(String name, String num, String dorm1, String dorm2, String type, String reason, String note, Date time, HttpServletRequest req){
        System.out.println(dorm1);
        Repair repair = new Repair();
        BuildingIdDormName buildingIdDormName = new BuildingIdDormName();
        Long id = Long.parseLong(req.getSession().getAttribute("id").toString());
        Integer buildingId = repairService.getBuildingIdByName(dorm1);
        buildingIdDormName.setBuildingId(buildingId);
        buildingIdDormName.setDormName(dorm2);
        Integer dormId = repairService.getDormIdByName(buildingIdDormName);
        repair.setNote(note);
        repair.setReason(reason);
        repair.setType(type);
        repair.setTime(time);
        repair.setName(name);
        repair.setPhone(num);
        repair.setDormId(dormId);
        repairService.insertRepair(repair);
        return "student/index";

    }
}
