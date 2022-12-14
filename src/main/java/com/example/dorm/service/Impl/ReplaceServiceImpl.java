package com.example.dorm.service.Impl;

import com.example.dorm.entity.Building;
import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Dorm;
import com.example.dorm.entity.Replace;
import com.example.dorm.mapper.BuildingMapper;
import com.example.dorm.mapper.ReplaceMapper;
import com.example.dorm.service.ReplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ReplaceServiceImpl implements ReplaceService {
    @Autowired
    ReplaceMapper replaceMapper;

    @Autowired
    BuildingMapper buildingMapper;

    public void insertReplace(Replace replace){
        replaceMapper.insert(replace);
    }

    public Integer getBuildingIdByName(String name){
        return replaceMapper.getBuildingIdByName(name);
    }

    public Integer getDormIdByName(BuildingIdDormName buildingIdDormName){
        return replaceMapper.getDormIdByName(buildingIdDormName);
    }

    public List<Replace> getChangeDormAll(){
        return replaceMapper.selectAll();
    }

    public Replace selectById(long id){
        return replaceMapper.selectById(id);
    }

    public  void updateById(Replace replace){
        replaceMapper.updateById(replace);
    }
}
