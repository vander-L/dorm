package com.example.dorm.service;

import com.example.dorm.entity.Building;
import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Dorm;
import com.example.dorm.entity.Replace;

import java.util.List;

public interface ReplaceService {
    void insertReplace(Replace replace);

    Integer getBuildingIdByName(String name);

    Integer getDormIdByName(BuildingIdDormName buildingIdDormName);

    List<Replace> getChangeDormAll();

    Replace selectById(long id);

    void updateById(Replace replace);
}
