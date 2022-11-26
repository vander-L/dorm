package com.example.dorm.service;

import com.example.dorm.entity.Dorm;

public interface DormService {

    Dorm selectById(long id);

    void updateById(Dorm dorm);
}
