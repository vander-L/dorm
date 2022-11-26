package com.example.dorm.service.Impl;

import com.example.dorm.entity.Admin;
import com.example.dorm.mapper.AdminMapper;
import com.example.dorm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;


    public Admin SelectById(long id){
        return adminMapper.selectById(id);
    }
}
