package com.zjgsu.digitalhbh.utils;

import lombok.Data;

@Data
public class JsonResult<E> {
    private Integer state;
    private E data;

    public JsonResult() {
    }

    public JsonResult(Integer state) {
        this.state = state;
    }

    public JsonResult(Integer state, E data) {
        this.state = state;
        this.data = data;
    }
}
