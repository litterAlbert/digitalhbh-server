package com.zjgsu.digitalhbh.controller;

import com.zjgsu.digitalhbh.entity.JsonResult;
import com.zjgsu.digitalhbh.entity.RelationShip;
import com.zjgsu.digitalhbh.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/ships")
@RestController
public class ShipController {
    @Autowired
    private ShipService shipService;

    @GetMapping("all")
    public JsonResult selectAllShips(){
        List<RelationShip> relationShips = shipService.selectAllShips();
        return new JsonResult(200,relationShips);
    }

    @GetMapping("classify")
    public JsonResult selectByClassify(Integer classify){
        List<RelationShip> relationShips =shipService.selectByClassify(classify);
        return new JsonResult(200,relationShips);
    }

    @GetMapping("time")
    public JsonResult selectBytime(String time){
        List<RelationShip> relationShips =shipService.selectByTime(time);
        return new JsonResult(200,relationShips);
    }
}
