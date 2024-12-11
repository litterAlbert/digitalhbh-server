package com.zjgsu.digitalhbh.entity;

import lombok.Data;

import java.util.List;

@Data
public class RelationShip {
    private Integer id;
    private String name;
    private  String ship;
    private Integer classify;
    private String time;

    public static void setNull(List<RelationShip> ships){
        for(RelationShip ship : ships){
            ship.setId(null);
            ship.setClassify(null);
            ship.setTime(null);
        }
    }
}
