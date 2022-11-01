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

    private Integer cla;

    private Integer phone;

    private Date time;

    private String feedback;

    private Integer dormId;

    @TableLogic
    private Integer deleted;

    private String password;

    public Student(String name, Integer sex, Integer grade, String dept, String pro, Integer cla, Integer phone, Date time, String feedback, Integer dormId) {
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
    }
}
