package com.zjgsu.digitalhbh.controller;

import com.zjgsu.digitalhbh.entity.Work;
import com.zjgsu.digitalhbh.service.WorkService;
import com.zjgsu.digitalhbh.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/works")
@RestController
public class WorkController {

    @Autowired
    private WorkService workService;

    @GetMapping("all")
    public JsonResult selectAllWorks(){
        List<Work> data = workService.selectAllWorks();
        return new JsonResult(200,data);
    }

    @GetMapping("classify")
    public JsonResult selectByClassify(Integer classify){
        List<Work> data = workService.selectByClassify(classify);
        return new JsonResult(200,data);
    }

    @GetMapping("time")
    public JsonResult selectByTime(Integer classify,String time){
        List<Work> data = workService.selectByTime(classify,time);
        return new JsonResult(200,data);
    }

    @GetMapping("details")
    public JsonResult selectByWorkname(String workname){
        Work data = workService.selectByWorkname(workname);
        return new JsonResult(200,data);
    }
}
