package com.xiaoli.carsHomeSystem.service;

import com.xiaoli.carsHomeServiceApi.systemService.UserService;
import com.xiaoli.carsHomeSystem.mapper.UserMapper;
import com.xiaoli.carshomemodel.System.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User checUser(String userName) {
        return userMapper.checkUser(userName);
    }
}
