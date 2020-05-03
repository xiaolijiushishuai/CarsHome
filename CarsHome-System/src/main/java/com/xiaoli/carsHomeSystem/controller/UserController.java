package com.xiaoli.carsHomeSystem.controller;


import com.xiaoli.carsHomeSystem.service.UserServiceImpl;
import com.xiaoli.carshomemodel.System.domain.User;
import com.xiaoli.carshomemodel.System.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/checkUser/{userName}")
    public User checkUser(@PathVariable("userName") String userName) {
        return userServiceImpl.checkUser(userName);
    }

    @PostMapping("/login")
    public ResponseResult login(@RequestParam("userAccount") String userAccount, @RequestParam("password") String password) {
        ResponseResult responseResult = new ResponseResult();
        System.out.println(userAccount);
        System.out.println(password);
        User user1 = userServiceImpl.logIn(userAccount, password);
        if (user1 != null) {
            responseResult.setSuccess(true);
        } else {
            responseResult.setSuccess(false);
        }
        return new ResponseResult();
    }

    @PostMapping("/regist")
    public ResponseResult regist(User user) {
        ResponseResult responseResult = new ResponseResult();
        int regist = userServiceImpl.registerUser(user);
        if (regist != 1) {
            responseResult.setSuccess(false);
            return responseResult;
        } else {
            responseResult.setSuccess(true);
            return responseResult;
        }
    }
}

