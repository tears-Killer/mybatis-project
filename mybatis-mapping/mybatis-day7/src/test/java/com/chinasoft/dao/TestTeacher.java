package com.chinasoft.dao;

import com.chinasoft.pojo.Teacher;
import com.chinasoft.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestTeacher {
    @Test
    public void getAllTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> tlist = mapper.getAllTeacher(1);
        System.out.println(tlist);
        for (Teacher teacher : tlist) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
}
