package com.zjgsu.digitalhbh.service.impl;

import com.zjgsu.digitalhbh.entity.Work;
import com.zjgsu.digitalhbh.mapper.WorkMapper;
import com.zjgsu.digitalhbh.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;

    @Override
    public List<Work> selectAllWorks() {
        List<Work> workList = workMapper.selectAllWorks();
        Work.setNull(workList);
        return workList;
    }

    @Override
    public List<Work> selectByClassify(Integer classify) {
        List<Work> workList = workMapper.selectByClassify(classify);
        Work.setNull(workList);
        return workList;
    }

    @Override
    public List<Work> selectByTime(Integer classify, String time) {
        List<Work> works = workMapper.selectByTime(classify, time);
        Work.setNull(works);
        return works;
    }
}
