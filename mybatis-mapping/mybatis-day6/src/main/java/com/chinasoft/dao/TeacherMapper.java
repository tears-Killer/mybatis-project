package com.chinasoft.dao;

import com.chinasoft.pojo.Teacher;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("teacher")
public interface TeacherMapper {

    @Select("select * from teacher")
    List<Teacher> getAllTeacher();
}
