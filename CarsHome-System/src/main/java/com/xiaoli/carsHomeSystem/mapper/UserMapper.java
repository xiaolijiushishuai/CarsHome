package com.xiaoli.carsHomeSystem.mapper;


import com.xiaoli.carshomemodel.System.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public User checkUser(String userName);
}
