package com.chinasoft.dao;

import com.chinasoft.pojo.Teacher;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

import java.util.List;


public interface TeacherMapper {


    List<Teacher> getAllTeacher(int id);
}
