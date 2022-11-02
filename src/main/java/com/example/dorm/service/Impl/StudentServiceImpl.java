package com.example.dorm.service.Impl;

import com.example.dorm.entity.Student;
import com.example.dorm.mapper.StudentMapper;
import com.example.dorm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    
    
    
    public Student SelectById(long id){
        return studentMapper.selectById(id);
    }

    public void UpdateById(Student stu){
        studentMapper.updateById(stu);
    }
}
