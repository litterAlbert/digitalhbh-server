package com.zjgsu.digitalhbh.mapper;

import com.zjgsu.digitalhbh.entity.Work;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkMapper {
    /**
     * @return 返回所有作品
     */
    @Select("SELECT * FROM t_works")
    List<Work> selectAllWorks();

    /**
     * @param classify 分类
     * @return 返回作品集
     */
    @Select("SELECT * FROM t_works WHERE classify = #{classify}")
    List<Work> selectByClassify(Integer classify);

    /**
     * @param classify 分类
     * @param time 时期
     * @return 返回相应的作品
     */
    @Select("SELECT * FROM t_works WHERE classify = #{classify} AND time = #{time}")
    List<Work> selectByTime(Integer classify,String time);

    /**
     * @param workname 作品名
     * @return 作品的详细信息
     */
    @Select("SELECT * FROM t_work_details WHERE workname = #{workname}")
    Work selectByWorkname(String workname);
}