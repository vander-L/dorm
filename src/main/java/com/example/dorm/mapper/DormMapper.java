package com.example.dorm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dorm.entity.Dorm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DormMapper extends BaseMapper<Dorm> {

    public Integer getDormIdByBuildingAndDorm(String building, String dorm);

}
