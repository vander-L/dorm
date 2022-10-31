package com.example.dorm;

import com.example.dorm.entity.Admin;
import com.example.dorm.mapper.AdminMapper;
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

    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());

        adminMapper.insert(new Admin("connery", 1, "15622113366"));
    }

}
