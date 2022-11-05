package com.example.dorm.service.Impl;

import com.example.dorm.entity.Replace;
import com.example.dorm.mapper.ReplaceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplaceServiceImpl {
    @Autowired
    ReplaceMapper replaceMapper;


    public void insertReplace(Replace replace){
        replaceMapper.insert(replace);
    }
}
