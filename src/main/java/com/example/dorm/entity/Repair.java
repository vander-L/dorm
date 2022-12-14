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
@TableName("a_repair")
public class Repair {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String type;

    private Date time;

    private String reason;

    private String solveInfo;

    private String note;

    private Integer dormId;

    @TableLogic
    private Integer deleted;

    private String name;

    private String phone;

    public Repair(String type, Date time, String reason, String solveInfo, String note, Integer dormId, String name, String phone) {
        this.type = type;
        this.time = time;
        this.reason = reason;
        this.solveInfo = solveInfo;
        this.note = note;
        this.dormId = dormId;
        this.name = name;
        this.phone = phone;
    }
}
