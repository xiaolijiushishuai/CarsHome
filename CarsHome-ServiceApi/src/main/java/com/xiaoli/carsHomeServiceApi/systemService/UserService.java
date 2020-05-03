package com.xiaoli.carsHomeServiceApi.systemService;


import com.xiaoli.carshomemodel.System.domain.User;
import com.xiaoli.carshomemodel.System.response.Response;

public interface UserService {

    public User checkUser(String userName);

    public int registerUser(User user);

    public User logIn(String userAccount,String password);
}
