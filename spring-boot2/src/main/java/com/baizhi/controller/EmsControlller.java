package com.baizhi.controller;

import com.baizhi.entity.Ems;
import com.baizhi.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test2")
public class EmsControlller {
    @Autowired
    private EmsService service;

    @RequestMapping("QueryAllController")
    public List<Ems> queryAllController(){
        List<Ems> list = service.queryAllService();
        return  list;
    }
}
