package com.example.dorm.service;

import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Repair;

public interface RepairService {
    void insertRepair(Repair repair);

    Integer getBuildingIdByName(String name);

    Integer getDormIdByName(BuildingIdDormName buildingIdDormName);
}
