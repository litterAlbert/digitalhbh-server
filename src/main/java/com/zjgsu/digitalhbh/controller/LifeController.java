package com.zjgsu.digitalhbh.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zjgsu.digitalhbh.entity.*;
import com.zjgsu.digitalhbh.mapper.LifeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/life")
@RestController
public class LifeController {
    @Autowired
    private LifeMapper lifeMapper;

    @GetMapping("person_event_titles")
    public JsonResult selectPersonEvents(){
        List<PersonEvent> personEvents = lifeMapper.selectPersonEvents();
        PersonEvent.setThreeNull(personEvents);
        return new JsonResult(200,personEvents);
    }

    @GetMapping("year_details")
    public JsonResult selectByYear(Integer year){
        YearDetails yearDetails = lifeMapper.selectByYear(year);
        return new JsonResult(200,yearDetails);
    }

    @GetMapping("person_event_details")
    public JsonResult selectByTitle(String title){
        System.err.println(title);
        PersonEvent personEvent = lifeMapper.selectByTitle(title);
        PersonEvent.setTwoNull(personEvent);
        return new JsonResult(200,personEvent);
    }

    @GetMapping("counts")
    public JsonResult getCounts(){
        List<Counts> counts = lifeMapper.getCounts();
        return new JsonResult(200,counts);
    }

    @GetMapping("other_event_titles")
    public JsonResult selectOthers(){
        List<OtherEvents> otherEvents = lifeMapper.selectOthers();
        OtherEvents.setNull1(otherEvents);
        return new JsonResult(200,otherEvents);
    }

    @GetMapping("other_event_details")
    public JsonResult selectByOtherTitle(String title){
        OtherEvents otherEvent = lifeMapper.selectByOtherTitle(title);
        OtherEvents.setNull2(otherEvent);
        return new JsonResult(200,otherEvent);
    }
}