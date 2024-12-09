package com.zjgsu.digitalhbh.service.impl;

import com.zjgsu.digitalhbh.entity.PersonEvent;
import com.zjgsu.digitalhbh.mapper.LifeMapper;
import com.zjgsu.digitalhbh.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeServiceImpl implements LifeService {
    @Autowired
    private LifeMapper lifeMapper;

    @Override
    public List<PersonEvent> selectPersonEvents() {
        List<PersonEvent> personEvents = lifeMapper.selectPersonEvents();
        PersonEvent.setThreeNull(personEvents);
        return personEvents;
    }
}
