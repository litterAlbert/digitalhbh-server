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

}
