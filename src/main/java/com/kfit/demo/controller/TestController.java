package com.kfit.demo.controller;

import com.kfit.demo.bean.Demo;
import com.kfit.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class TestController {



    @Resource

    private TestService testService;



    @RequestMapping("/test1")

    public String test(){

     for(Demo d:testService.getList()){

         System.out.println(d);

     }


        for(Demo d:testService.getListByDs1()){

            System.out.println(d);

        }

        return"ok";

    }



}
