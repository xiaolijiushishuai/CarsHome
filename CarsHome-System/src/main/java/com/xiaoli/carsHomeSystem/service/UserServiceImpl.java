package com.xiaoli.carsHomeSystem.service;

import com.xiaoli.carsHomeServiceApi.systemService.UserService;
import com.xiaoli.carsHomeSystem.mapper.UserMapper;
import com.xiaoli.carshomemodel.System.domain.User;
import com.xiaoli.carshomemodel.System.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User checkUser(String userName) {
        return userMapper.checkUser(userName);
    }

    @Override
    public int registerUser(User user) {
        return userMapper.registerUser(user);
    }

    @Override
    public User logIn(String userAccount,String password) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(userAccount);
        user.setEmail(userAccount);
        return userMapper.logIn(user);
    }
}
