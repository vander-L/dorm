package com.example.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("a_campus")
public class Campus
{
        @TableId(value = "id", type = IdType.AUTO)
        private Long id;

        private String name;

        private String loc;

        private String phone;

        private String postcode;

    @TableLogic
    private Integer deleted;

    public Campus(String name, String loc, String phone, String postcode) {
        this.name = name;
        this.loc = loc;
        this.phone = phone;
        this.postcode = postcode;
    }
}
