package com.zjgsu.digitalhbh.entity;

import lombok.Data;

@Data
public class WorkDetails {
    private Integer id;
    private String workname;
    private String author;
    private String era;
    private String work;
    private Integer create_year;
    private String texture;
    private String size;
    private String collection;
    private String introduction;

    public static void setNull(WorkDetails workDetails){
        workDetails.setId(null);
    }
}
