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


    /**
     * @param classify 分类
     * @return 分类后的结果集
     */
    @Select("SELECT * FROM t_relationships where classify=#{classify}")
    List<RelationShip> selectByClassify(Integer classify);

    /**
     * @param time 时期
     * @return 返回不同时期的关系
     */
    @Select("SELECT * FROM t_relationships where time=#{time}")
    List<RelationShip> selectByTime(String time);
}
