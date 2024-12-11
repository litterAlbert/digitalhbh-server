package com.zjgsu.digitalhbh.service;

import com.zjgsu.digitalhbh.entity.RelationShip;
import com.zjgsu.digitalhbh.mapper.ShipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {
    @Autowired
    private ShipMapper shipMapper;

    public List<RelationShip> selectAllShips(){
        List<RelationShip> relationShips = shipMapper.selectAllShips();
        RelationShip.setNull(relationShips);
        return relationShips;
    }
}
