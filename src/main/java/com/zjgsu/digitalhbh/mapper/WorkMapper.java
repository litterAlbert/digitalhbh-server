package com.zjgsu.digitalhbh.mapper;

import com.zjgsu.digitalhbh.entity.Work;

import java.util.List;

/**
 * 作品信息持久层接口
 */
public interface WorkMapper {
    /**
     * 查询所有的作品信息表
     * @return 返回所有的作品信息
     */
    List<Work> selectAllWorks();

    /**
     * 获取书法/绘画作品
     * @param classify 分类
     * @return 返回所有书法/绘画作品
     */
    List<Work> selectByClassify(Integer classify);

}
