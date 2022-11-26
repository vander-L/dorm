package com.example.dorm.controller;


import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Replace;
import com.example.dorm.service.ReplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class ReplaceController{
    @Autowired
    ReplaceService replaceService;



    @RequestMapping( "/toReplace")
    public String replace(String name, String no, String city, String dorm1, String city1, String dorm2){
        System.out.println("1111");
        Replace replace = new Replace();
        BuildingIdDormName beforeBuildingIdDormName = new BuildingIdDormName();
        BuildingIdDormName afterBuildingIdDormName = new BuildingIdDormName();
        Integer beforeBuildingId = replaceService.getBuildingIdByName(city);
        Integer afterBuildingId = replaceService.getBuildingIdByName(city1);
        beforeBuildingIdDormName.setDormName(dorm1);
        beforeBuildingIdDormName.setBuildingId(beforeBuildingId);
        afterBuildingIdDormName.setDormName(dorm2);
        afterBuildingIdDormName.setBuildingId(afterBuildingId);
        Integer beforeDormId = replaceService.getDormIdByName(beforeBuildingIdDormName);
        Integer afterDormId = replaceService.getDormIdByName(afterBuildingIdDormName);
        replace.setStudentName(name);
        replace.setStudentId(Integer.parseInt(no));
        replace.setBeforeBuildingName(city);
        replace.setBeforeDormName(dorm1);
        replace.setAfterBuildingName(city1);
        replace.setAfterDormName(dorm2);
        replace.setBeforeBuildingId(beforeBuildingId);
        replace.setAfterBuildingId(afterBuildingId);
        replace.setBeforeDormId(beforeDormId);
        replace.setAfterDormId(afterDormId);
        replaceService.insertReplace(replace);
        return "student/index";
    }

    @RequestMapping("/replaceData")
    @ResponseBody
    public String replaceData(){
        return null;
    }

}
