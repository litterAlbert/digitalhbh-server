package com.zjgsu.digitalhbh.service;

import com.zjgsu.digitalhbh.entity.PersonEvent;
import com.zjgsu.digitalhbh.mapper.LifeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeService {
    @Autowired
    private LifeMapper lifeMapper;

    public List<PersonEvent> selectPersonEvents() {
        List<PersonEvent> personEvents = lifeMapper.selectPersonEvents();
        PersonEvent.setThreeNull(personEvents);
        return personEvents;
    }
}