package com.zjgsu.digitalhbh.controller;

import com.zjgsu.digitalhbh.entity.JsonResult;
import com.zjgsu.digitalhbh.entity.Work;
import com.zjgsu.digitalhbh.entity.WorkDetails;
import com.zjgsu.digitalhbh.mapper.WorkMapper;

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
    private WorkMapper workMapper;

    @GetMapping("all")
    public JsonResult selectAllWorks(){
        List<Work> workList = workMapper.selectAllWorks();
        Work.setNull(workList);
        return new JsonResult(200,workList);
    }

    @GetMapping("classify")
    public JsonResult selectByClassify(Integer classify){
        List<Work> workList = workMapper.selectByClassify(classify);
        Work.setNull(workList);
        return new JsonResult(200,workList);
    }

    @GetMapping("time")
    public JsonResult selectByTime(Integer classify,String time){
        List<Work> works = workMapper.selectByTime(classify, time);
        Work.setNull(works);
        return new JsonResult(200,works);
    }

    @GetMapping("details")
    public JsonResult selectByWorkname(String workname){
        WorkDetails workDetails = workMapper.selectByWorkname(workname);
        WorkDetails.setNull(workDetails);
        return new JsonResult(200,workDetails);
    }

    @GetMapping("search")
    public JsonResult searchByWorkname(String workname){
        Work work = workMapper.searchByWorkname(workname);
        Work.setNull(work);
        return new JsonResult(200,work);
    }
}