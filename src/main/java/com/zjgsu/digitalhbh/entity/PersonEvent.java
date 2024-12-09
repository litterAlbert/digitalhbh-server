package com.zjgsu.digitalhbh.entity;

import lombok.Data;

import java.util.List;

@Data
public class PersonEvent {
    private Integer year;
    private String event;
    private String title;
    private String workname;
    private String work;

    public static void setThreeNull(List<PersonEvent> events){
        for(PersonEvent event : events){
            event.setEvent(null);
            event.setWorkname(null);
            event.setWork(null);
        }
    }
}