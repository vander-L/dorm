package com.example.dorm.service;

import com.example.dorm.entity.Admin;

public interface AdminService {
    Admin SelectById(long id);


    void UpdateById(Admin admin);
}
