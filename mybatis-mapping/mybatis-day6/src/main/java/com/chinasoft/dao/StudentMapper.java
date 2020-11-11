package com.chinasoft.dao;

import com.chinasoft.pojo.Student;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("student")
public interface StudentMapper {

    List<Student> getAllStudent();
}
