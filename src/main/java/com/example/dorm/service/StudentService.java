package com.example.dorm.service;

import com.example.dorm.entity.Student;
import com.example.dorm.mapper.StudentMapper;

public interface StudentService {
    Student SelectById(long id);
}
