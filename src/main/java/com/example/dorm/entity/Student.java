package com.example.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@TableName("a_student")
public class Student {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer sex;

    private Integer grade;

    private String dept;

    private String pro;

    private String cla;

    private String phone;

    private Date time;

    private String feedback;

    private Integer dormId;

    @TableLogic
    private Integer deleted;

    private String password;

    private String email;

    private String school;

    private String building;

    private String dorm;

    public Student(Long id, String name, Integer sex, Integer grade, String dept, String pro, String cla, String phone, Date time, String feedback, Integer dormId ,String email, String school) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.dept = dept;
        this.pro = pro;
        this.cla = cla;
        this.phone = phone;
        this.time = time;
        this.feedback = feedback;
        this.dormId = dormId;
        this.email = email;
        this.school = school;
    }
}
