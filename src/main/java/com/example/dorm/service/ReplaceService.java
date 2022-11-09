package com.example.dorm.service;

import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Replace;

public interface ReplaceService {
    public void insertReplace(Replace replace);

    public Integer getBuildingIdByName(String name);

    public Integer getDormIdByName(BuildingIdDormName buildingIdDormName);
}
