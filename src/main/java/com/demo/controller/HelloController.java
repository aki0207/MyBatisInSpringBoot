package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.HelloBean;
import com.demo.service.HelloService;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="hello")
    public String init(Model model) {

        List<HelloBean> list = helloService.selectName();
        model.addAttribute("list",list);

        return "hello";
    }
}
