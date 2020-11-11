package com.chinasoft.mapper;

import com.chinasoft.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper{

    @Select("select * from user where account = #{account} and password = #{password}")
    User selectByAccountAndPassword(@Param("account")String account,@Param("password")String password);
}
