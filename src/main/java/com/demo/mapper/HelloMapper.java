package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.bean.HelloBean;

@Mapper
public interface HelloMapper {

    List<HelloBean> selectEmpAll();
}
