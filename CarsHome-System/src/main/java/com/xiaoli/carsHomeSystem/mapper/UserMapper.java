package com.xiaoli.carsHomeSystem.mapper;


import com.xiaoli.carshomemodel.System.domain.User;
import com.xiaoli.carshomemodel.System.response.Response;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    public User checkUser(String userName);

    public int registerUser(User user);

    public User logIn(@Param("user") User user);

}
