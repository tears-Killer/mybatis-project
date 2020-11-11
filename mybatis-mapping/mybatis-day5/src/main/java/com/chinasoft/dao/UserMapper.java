package com.chinasoft.dao;

import com.chinasoft.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

@Alias("user")
public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id")int id);

    @Insert("insert into user(username,password) values(#{username},#{pwd})")
    int addUser(User u);

    @Update("update user set username = #{username},password=#{pwd} where uid = #{uid}")
    int updateUser(User u);

    @Delete("delete from user where uid = #{id}")
    int deleteUser(@Param("id")int id);
}
