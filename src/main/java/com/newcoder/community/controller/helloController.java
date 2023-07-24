package com.newcoder.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello Spring boot";
    }

    @RequestMapping(path = "/select",method = RequestMethod.GET)
    @ResponseBody
    public String select(){
        return "success";
    }
}
