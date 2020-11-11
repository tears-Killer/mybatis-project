package com.chinasoft.dao;

import com.chinasoft.pojo.User;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

@Alias("user")
public interface UserMapper {
    User selectById(int id);

}
