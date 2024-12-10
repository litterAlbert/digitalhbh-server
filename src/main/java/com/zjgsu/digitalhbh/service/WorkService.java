package com.zjgsu.digitalhbh.service;

import com.zjgsu.digitalhbh.entity.Work;
import com.zjgsu.digitalhbh.entity.WorkDetails;

import java.util.List;

public interface WorkService {

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

    /**
     * @param workname 作品名
     * @return 作品信息
     */
    WorkDetails selectByWorkname(String workname);
}
