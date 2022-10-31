package com.example.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("a_dorm")
public class Dorm {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer leaderId;

    private Integer floor;

    private Integer numAll;

    private Integer numLeft;

    private Integer buildingId;

    private Integer numActual;

    private Integer water;

    private Integer electricity;

    @TableLogic
    private Integer deleted;

    public Dorm(String name, Integer leaderId, Integer floor, Integer numAll, Integer numLeft, Integer buildingId, Integer numActual, Integer water, Integer electricity) {
        this.name = name;
        this.leaderId = leaderId;
        this.floor = floor;
        this.numAll = numAll;
        this.numLeft = numLeft;
        this.buildingId = buildingId;
        this.numActual = numActual;
        this.water = water;
        this.electricity = electricity;
    }
}
