package com.zjgsu.digitalhbh.mapper;

import com.zjgsu.digitalhbh.entity.RelationShip;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShipMapper {
    /**
     * @return 返回所有的人物关系
     */
    @Select("SELECT * FROM t_relationships")
    List<RelationShip> selectAllShips();
}
