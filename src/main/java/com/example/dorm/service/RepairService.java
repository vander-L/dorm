package com.example.dorm.service;

import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Repair;

public interface RepairService {
    public void insertRepair(Repair repair);

    public Integer getBuildingIdByName(String name);

    public Integer getDormIdByName(BuildingIdDormName buildingIdDormName);
}
