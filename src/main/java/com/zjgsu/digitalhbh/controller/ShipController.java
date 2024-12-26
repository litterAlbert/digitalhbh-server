package com.zjgsu.digitalhbh.controller;

import com.zjgsu.digitalhbh.entity.JsonResult;
import com.zjgsu.digitalhbh.entity.RelationShip;
import com.zjgsu.digitalhbh.mapper.ShipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/ships")
@RestController
public class ShipController {
    @Autowired
    private ShipMapper shipMapper;

    @GetMapping("all")
    public JsonResult selectAllShips(){
        List<RelationShip> relationShips = shipMapper.selectAllShips();
        RelationShip.setNull(relationShips);
        return new JsonResult(200,relationShips);
    }

    @GetMapping("classify")
    public JsonResult selectByClassify(Integer classify){
        List<RelationShip> relationShips = shipMapper.selectByClassify(classify);
        RelationShip.setNull(relationShips);
        return new JsonResult(200,relationShips);
    }

    @GetMapping("time")
    public JsonResult selectBytime(String time){
        List<RelationShip> relationShips = shipMapper.selectByTime(time);
        RelationShip.setNull(relationShips);
        return new JsonResult(200,relationShips);
    }
}
