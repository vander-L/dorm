package com.example.dorm.service.Impl;

import com.example.dorm.entity.Dorm;
import com.example.dorm.mapper.DormMapper;
import com.example.dorm.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class DormServiceImpl implements DormService {

    @Autowired
    DormMapper dormMapper;

    public Dorm selectById(long id){
        return dormMapper.selectById(id);
    }

    public void updateById(Dorm dorm){
        dormMapper.updateById(dorm);
    }
}
