package com.zjgsu.digitalhbh.service;

import com.zjgsu.digitalhbh.entity.PersonEvent;

import java.util.List;

public interface LifeService {

    /**
     * @return 返回事件集合
     */
    List<PersonEvent> selectPersonEvents();
}
