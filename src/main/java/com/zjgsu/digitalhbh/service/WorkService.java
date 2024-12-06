package com.zjgsu.digitalhbh.service;

import com.zjgsu.digitalhbh.entity.Work;

import java.util.List;

/**
 * 作品信息业务层接口
 */
public interface WorkService {

    /**
     * 查询所有作品信息
     * @return 返回所有作品信息
     */
    List<Work> selectAllWorks();

    /**
     * 查询书法/绘画作品
     * @param classify 分类
     * @return 返回所有书法/绘画作品信息
     */
    List<Work> selectByClassify(Integer classify);


}
