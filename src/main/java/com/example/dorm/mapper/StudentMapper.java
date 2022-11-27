package com.example.dorm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dorm.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {

//    public List<Student> seekStudent(
//            Long id,
//            String name,
//            String pro,
//            String cla,
//            Integer sex,
//            String building,
//            String dorm,
//            Date beginTime,
//            Date endTime
//    );

}
