package com.chinassoft.dao;

import com.chinasoft.dao.StudentMapper;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudent {
    @Test
    public void getAllStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> slist = mapper.getAllStudent();
        for (Student student : slist) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
