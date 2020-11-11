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

//        第一种方式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> ulist = userMapper.getAll();

//        第二种方式
//        List<User> ulist = sqlSession.selectList("com.chinasoft.dao.UserDao.getAll");
        for (User user : ulist) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void selectById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User( "王子璇", "123"));
        if(res!=0){
            System.out.println("修改成功");
        }
//        增删改要提交事务才能成功修改数据库数据
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(2, "wzx", "123456"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectByUsernameAndPassword(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","王子璇");
        map.put("pwd","123");
        User user = mapper.selectByUsernameAndPassword(map);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }
}
