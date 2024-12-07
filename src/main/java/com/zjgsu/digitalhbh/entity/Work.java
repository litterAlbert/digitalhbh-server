package com.zjgsu.digitalhbh.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class Work {
    private Integer id;
    private String workname;
    private String author;
    private String era;
    private String work;
    private Integer classify;
    private Integer year;
    private String time;

    public static void setNull(List<Work> workList){
        for(Work work : workList){
            work.setId(null);
            work.setTime(null);
            work.setClassify(null);
            work.setYear(null);
        }
    }
}
