package com.zjgsu.digitalhbh.controller;

import com.zjgsu.digitalhbh.entity.JsonResult;
import com.zjgsu.digitalhbh.entity.PersonEvent;
import com.zjgsu.digitalhbh.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/life")
@RestController
public class LifeController {
    @Autowired
    private LifeService lifeService;

    @GetMapping("person_event_titles")
    public JsonResult selectPersonEvents(){
        List<PersonEvent> personEvents = lifeService.selectPersonEvents();
        return new JsonResult(200,personEvents);
    }
}
