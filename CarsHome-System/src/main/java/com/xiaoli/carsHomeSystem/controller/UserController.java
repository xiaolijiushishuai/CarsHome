package com.xiaoli.carsHomeSystem.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/check/{id}")
    public String check(@PathVariable("id") String id){
        return "xiaolijiushizhemeshuai6";
    }
}
