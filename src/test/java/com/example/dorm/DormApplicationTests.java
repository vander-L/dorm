package com.example.dorm;

import com.alibaba.fastjson2.JSON;
import com.example.dorm.entity.Admin;
import com.example.dorm.entity.BuildingIdDormName;
import com.example.dorm.mapper.AdminMapper;
import com.example.dorm.mapper.RepairMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class DormApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    RepairMapper repairMapper;

    @Test
    void contextLoads() {
    }

}
