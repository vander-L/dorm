package com.example.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("a_replace")
public class Replace {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer studentId;

    private String studentName;

    private Integer beforeDormId;

    private String beforeDormName;

    private Integer afterDormId;

    private String afterDormName;

    @TableLogic
    private Integer deleted;

    private String afterBuildingName;

    private String beforeBuildingName;

    private Integer beforeBuildingId;

    private Integer afterBuildingId;

    private String yes;

    public Replace(Integer studentId, String studentName, Integer beforeDormId, String beforeDormName, Integer afterDormId, String afterDormName, String afterBuildingName, String beforeBuildingName, Integer beforeBuildingId, Integer afterBuildingId ,String yes) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.beforeDormId = beforeDormId;
        this.beforeDormName = beforeDormName;
        this.afterDormId = afterDormId;
        this.afterDormName = afterDormName;
        this.afterBuildingName = afterBuildingName;
        this.beforeBuildingName = beforeBuildingName;
        this.beforeBuildingId = beforeBuildingId;
        this.afterBuildingId = afterBuildingId;
        this.yes = yes;
    }
}
