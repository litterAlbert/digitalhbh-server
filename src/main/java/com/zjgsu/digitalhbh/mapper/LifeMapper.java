package com.zjgsu.digitalhbh.mapper;

import com.zjgsu.digitalhbh.entity.PersonEvent;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LifeMapper {
    /**
     * @return 返回事件集合
     */
    @Select("SELECT * FROM t_person_events ORDER BY year ASC")
    List<PersonEvent> selectPersonEvents();
}
