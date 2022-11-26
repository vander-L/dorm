package com.example.dorm.controller;


import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Dorm;
import com.example.dorm.service.DormService;
import com.example.dorm.service.ReplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayController {

    @Autowired
    DormService dormService;

    @Autowired
    ReplaceService replaceService;

    @RequestMapping(value = "/toPay")
    public String pay(String buildingName, String dormName, String type, String money, Model model){
        Integer buildingId = replaceService.getBuildingIdByName(buildingName);
        BuildingIdDormName buildingIdDormName = new BuildingIdDormName(buildingId, dormName);
        Integer dormId = replaceService.getDormIdByName(buildingIdDormName);
        Dorm dorm = dormService.selectById(dormId);
        model.addAttribute("Dorm",dorm);
        Dorm dorm1 = new Dorm();
        dorm1.setId(Long.valueOf(dormId));
        if (type.equals("水费")) {
            model.addAttribute("msg", dorm.getWater());
            dorm1.setWater(dorm.getWater() + Integer.parseInt(money));
        } else if (type.equals("电费")) {
            model.addAttribute("msg",dorm.getElectricity());
            dorm1.setElectricity(dorm.getElectricity() + Integer.parseInt(money));
        }
        dormService.updateById(dorm1);
        return "student/pay";
    }
}
