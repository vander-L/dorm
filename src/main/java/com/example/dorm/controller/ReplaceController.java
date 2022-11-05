package com.example.dorm.controller;


import com.example.dorm.entity.Replace;
import com.example.dorm.service.ReplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class ReplaceController {
    @Autowired
    ReplaceService replaceService;



    @RequestMapping(value = "/toreplace")
    public String replace(String name, String no, String city, String dorm1, String city1, String dorm2){
        Replace replace = new Replace();
        replace.setStudentName(name);
        replace.setStudentId(Integer.parseInt(no));
        replace.setBeforeBuildingName(city);
        replace.setBeforeDormName(dorm1);
        replace.setAfterBuildingName(city1);
        replace.setAfterDormName(dorm2);
        return null;
    }

}
