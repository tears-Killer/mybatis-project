package com.chinasoft.dao;

import com.chinasoft.pojo.User;
import com.chinasoft.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUserDao {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> ulist = userMapper.getAll();

        for (User user : ulist) {
            System.out.println(user);
        }

        sqlSession.close();
    }


}
