package com.springcloud.providerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("provider/demo")
    public String Demo(){
        return  "ProviderDemo";
    }



}
