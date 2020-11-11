package com.chinasoft.dao;

import com.chinasoft.pojo.User;
import com.chinasoft.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUserDao {
    final static Logger logger = Logger.getLogger(TestUserDao.class);
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testlog(){
        logger.info("进入日志成功");
    }

    @Test
    public void page(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("startIndex",2);
        map.put("pageSize",2);
        List<User> users = mapper.pageSlice(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
