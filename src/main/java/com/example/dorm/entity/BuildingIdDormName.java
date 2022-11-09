package com.example.dorm.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BuildingIdDormName {
    private Integer BuildingId;

    private String DormName;

    public BuildingIdDormName(Integer BuildingId, String DormName){
        this.BuildingId = BuildingId;
        this.DormName = DormName;
    }

}
