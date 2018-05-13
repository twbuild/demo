package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.grilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class grilController {
    @Autowired
    grilService _grilService;

    @GetMapping("/Gril")
    public String getGril(){
        String json = JSON.toJSONString(_grilService.getGrilByAge(20));
        return json;
    }
}
