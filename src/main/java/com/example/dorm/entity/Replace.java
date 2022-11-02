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

    public Replace(Integer studentId, String studentName, Integer beforeDormId, String beforeDormName, Integer afterDormId, String afterDormName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.beforeDormId = beforeDormId;
        this.beforeDormName = beforeDormName;
        this.afterDormId = afterDormId;
        this.afterDormName = afterDormName;
    }
}
