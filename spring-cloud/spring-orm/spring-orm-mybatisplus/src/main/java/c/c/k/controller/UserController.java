package c.c.k.controller;

import c.c.k.service.IUservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title c.c.k.controller
 * @Copyright: Copyright 2020
 * @Description: java <br/>
 * @Created on 2020/1/2 chenck
 */
@RestController
public class UserController {
    @Resource
    private IUservice uservice;

    @GetMapping("/get")
    public String get(){
        uservice.add();
        return "abc";
    }
}
