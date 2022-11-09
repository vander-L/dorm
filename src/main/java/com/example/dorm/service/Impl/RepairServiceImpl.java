package com.example.dorm.service.Impl;

import com.example.dorm.entity.Repair;
import com.example.dorm.mapper.RepairMapper;
import com.example.dorm.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    RepairMapper repairMapper;

    public void insertRepair(Repair repair){
        repairMapper.insert(repair);
    }
}
