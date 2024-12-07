package com.zjgsu.digitalhbh.mapper;

import com.zjgsu.digitalhbh.entity.Work;

import java.util.List;

public interface WorkMapper {
    /**
     * @return 返回所有作品
     */
    List<Work> selectAllWorks();

    /**
     * @param classify 分类
     * @return 返回作品集
     */
    List<Work> selectByClassify(Integer classify);

    /**
     * @param classify 分类
     * @param time 时期
     * @return 返回相应的作品
     */
    List<Work> selectByTime(Integer classify,String time);

}
