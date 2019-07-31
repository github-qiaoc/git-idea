package com.baizhi.service;

import com.baizhi.dao.EmsDao;
import com.baizhi.entity.Ems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmsServiceImpl implements EmsService{
    @Autowired
    private EmsDao dao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Ems> queryAllService() {
        List<Ems> list = dao.queryAllDao();
        return  list;
    }
}
