package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.HelloBean;
import com.demo.mapper.HelloMapper;

@Service
public class HelloService {

    @Autowired
    private HelloMapper helloMapper;

    public List<HelloBean> selectName(){
        return helloMapper.selectEmpAll();
    }
}
