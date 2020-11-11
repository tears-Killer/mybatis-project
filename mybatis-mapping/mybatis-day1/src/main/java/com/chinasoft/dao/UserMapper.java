package com.chinasoft.dao;

import com.chinasoft.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

     List<User> getAll();

    User selectById(int id);

     int addUser(User u);

    int updateUser(User u);

     int deleteUser(int id);

     User selectByUsernameAndPassword(Map<String,Object> map);
}
