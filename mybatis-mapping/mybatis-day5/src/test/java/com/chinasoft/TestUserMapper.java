package com.chinasoft;

import com.chinasoft.dao.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestUserMapper {

    @Test
    public void getAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> ulist = mapper.getAll();
        for (User user : ulist) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
