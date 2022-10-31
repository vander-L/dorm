package com.example.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("a_building")
public class Building {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer floorNum;

    private Integer dormNum;

    private Integer campusId;

    private Integer adminId;

    @TableLogic
    private Integer deleted;

    public Building(String name, Integer floorNum, Integer dormNum, Integer campusId, Integer adminId) {
        this.name = name;
        this.floorNum = floorNum;
        this.dormNum = dormNum;
        this.campusId = campusId;
        this.adminId = adminId;
    }
}
