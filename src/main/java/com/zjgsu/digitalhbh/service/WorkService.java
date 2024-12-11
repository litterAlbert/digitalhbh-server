package com.zjgsu.digitalhbh.service;

import com.zjgsu.digitalhbh.entity.Work;
import com.zjgsu.digitalhbh.entity.WorkDetails;
import com.zjgsu.digitalhbh.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {

    @Autowired
    private WorkMapper workMapper;

    public List<Work> selectAllWorks() {
        List<Work> workList = workMapper.selectAllWorks();
        Work.setNull(workList);
        return workList;
    }

    public List<Work> selectByClassify(Integer classify) {
        List<Work> workList = workMapper.selectByClassify(classify);
        Work.setNull(workList);
        return workList;
    }

    public List<Work> selectByTime(Integer classify, String time) {
        List<Work> works = workMapper.selectByTime(classify, time);
        Work.setNull(works);
        return works;
    }

    public WorkDetails selectByWorkname(String workname) {
        WorkDetails workDetails = workMapper.selectByWorkname(workname);
        WorkDetails.setNull(workDetails);
        return workDetails;
    }
}
