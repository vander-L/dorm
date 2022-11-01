package com.example.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("a_admin")
public class Admin {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer sex;

    private String phone;

    @TableLogic
    private Integer deleted;

    private String password;

    public Admin(String name, Integer sex, String phone) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }


}
