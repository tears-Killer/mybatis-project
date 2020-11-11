package com.chinasoft.dao;

import com.chinasoft.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("student")
public interface StudentMapper {

    @Select("select * from student")
    List<Student> getAllStudent();
}
