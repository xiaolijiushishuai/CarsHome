package com.xiaoli.carsHomeSystem.controller;


import com.xiaoli.carsHomeServiceApi.systemService.UserService;
import com.xiaoli.carsHomeSystem.service.UserServiceImpl;
import com.xiaoli.carshomemodel.System.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/check/{id}")
    public String check(@PathVariable("id") String id){
        return "xiaolijiushizhemeshuai6";
    }

    @GetMapping("/checkUser/{userName}")
    public User checkUser(@PathVariable("userName") String userName){
        return userServiceImpl.checUser(userName);
    }
    //this is a problem    404 error
    /*@PostMapping("/model")
    public ModelAndView getMesge(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.html");
        return modelAndView;
    }*/
}

