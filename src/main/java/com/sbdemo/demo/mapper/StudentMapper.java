package com.sbdemo.demo.mapper;

import com.sbdemo.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface StudentMapper {
    @Select("select * from students")
    List<Student>  list();

}
