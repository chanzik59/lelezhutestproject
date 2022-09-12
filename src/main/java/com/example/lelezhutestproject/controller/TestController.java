package com.example.lelezhutestproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/project/method")
public class TestController {

    @RequestMapping("/get")
    @ResponseBody
    public String testGetMethod() {
        return "叻叻猪真棒！！";
    }
}
