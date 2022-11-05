package com.example.dorm.service.Impl;

import com.example.dorm.mapper.BuildingMapper;
import com.example.dorm.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    BuildingMapper buildingMapper;

}
