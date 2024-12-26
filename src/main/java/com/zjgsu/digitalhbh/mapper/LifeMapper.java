package com.zjgsu.digitalhbh.mapper;

import com.zjgsu.digitalhbh.entity.Counts;
import com.zjgsu.digitalhbh.entity.OtherEvents;
import com.zjgsu.digitalhbh.entity.PersonEvent;
import com.zjgsu.digitalhbh.entity.YearDetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LifeMapper {
    /**
     * @return 返回事件集合
     */
    @Select("SELECT * FROM t_person_events ORDER BY year ASC")
    List<PersonEvent> selectPersonEvents();

    /**
     * @param year 年份
     * @return 返回该年的详情
     */
    @Select("SELECT * FROM t_year_details WHERE year=#{year}")
    YearDetails selectByYear(Integer year);

    /**
     * @param title 事件标题
     * @return 事件详情
     */
    @Select("SELECT * FROM t_person_events WHERE title=#{title}")
    PersonEvent selectByTitle(String title);

    /**
     * @return 获得各年的创作数量
     */
    @Select("SELECT * FROM t_counts")
    List<Counts> getCounts();

    /**
     * @return 返回事件标题
     */
    @Select("SELECT * FROM t_other_events ORDER BY year ASC, classify ASC")
    List<OtherEvents> selectOthers();

    /**
     * @param title 事件标题
     * @return 事件详情
     */
    @Select("SELECT * FROM t_other_events WHERE title=#{title}")
    OtherEvents selectByOtherTitle(String title);
}
