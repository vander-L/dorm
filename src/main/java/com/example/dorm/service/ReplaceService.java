package com.example.dorm.service;

import com.example.dorm.entity.Building;
import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Dorm;
import com.example.dorm.entity.Replace;

import java.util.List;

public interface ReplaceService {
    public void insertReplace(Replace replace);

    public Integer getBuildingIdByName(String name);

    public Integer getDormIdByName(BuildingIdDormName buildingIdDormName);

    public List<Replace> getChangeDormAll();

    public Replace selectById(long id);

    public void updateById(Replace replace);
}
