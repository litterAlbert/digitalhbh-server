package com.zjgsu.digitalhbh.entity;

import lombok.Data;

import java.util.List;

@Data
public class OtherEvents {
    private Integer year;
    private String event;
    private String title;
    private String workname;
    private String work;
    private Integer classify;

    public static void setNull1(List<OtherEvents> otherEvents){
        for(OtherEvents otherEvent:otherEvents){
            otherEvent.setEvent(null);
            otherEvent.setWorkname(null);
            otherEvent.setWork(null);
        }
    }

    public static void setNull2(OtherEvents otherEvent){
            otherEvent.setYear(null);
            otherEvent.setTitle(null);
            otherEvent.setClassify(null);
    }
}
