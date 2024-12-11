package com.zjgsu.digitalhbh.entity;

import lombok.Data;

@Data
public class JsonResult {
    private Integer state;
    private Object data;

    public JsonResult() {
    }

    public JsonResult(Integer state) {
        this.state = state;
    }

    public JsonResult(Integer state, Object data) {
        this.state = state;
        this.data = data;
    }
}
