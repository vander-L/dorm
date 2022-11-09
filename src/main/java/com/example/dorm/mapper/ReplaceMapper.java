package com.example.dorm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.entity.Dorm;
import com.example.dorm.entity.Replace;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReplaceMapper extends BaseMapper<Replace> {
    public Integer getBuildingIdByName(String name);

    public Integer getDormIdByName(BuildingIdDormName buildingIdDormName);

    public List<Dorm> getAllHaveNullDorm(Integer buildingId);
}
