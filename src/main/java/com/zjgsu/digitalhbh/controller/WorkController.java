package com.zjgsu.digitalhbh.controller;

import com.zjgsu.digitalhbh.entity.JsonResult;
import com.zjgsu.digitalhbh.entity.Work;
import com.zjgsu.digitalhbh.entity.WorkDetails;
import com.zjgsu.digitalhbh.service.WorkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/works")
@RestController
public class WorkController {

    @Autowired
    private WorkService workService;

    @GetMapping("all")
    public JsonResult selectAllWorks(){
        List<Work> works = workService.selectAllWorks();
        return new JsonResult(200,works);
    }

    @GetMapping("classify")
    public JsonResult selectByClassify(Integer classify){
        List<Work> worksClassify = workService.selectByClassify(classify);
        return new JsonResult(200,worksClassify);
    }

    @GetMapping("time")
    public JsonResult selectByTime(Integer classify,String time){
        List<Work> workTime = workService.selectByTime(classify,time);
        return new JsonResult(200,workTime);
    }

    @GetMapping("details")
    public JsonResult selectByWorkname(String workname){
        System.err.println(workname);
        WorkDetails workDetails = workService.selectByWorkname(workname);
        return new JsonResult(200,workDetails);
    }
}
