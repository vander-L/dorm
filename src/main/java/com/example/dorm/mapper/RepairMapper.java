package com.example.dorm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Repair;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RepairMapper extends BaseMapper<Repair> {
    public Integer getBuildingIdByName(String name);

    public Integer getDormIdByName(BuildingIdDormName buildingIdDormName);
}
