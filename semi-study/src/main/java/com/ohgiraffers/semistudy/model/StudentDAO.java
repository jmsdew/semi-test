package com.ohgiraffers.semistudy.model;

import com.ohgiraffers.semistudy.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDAO {
     List<StudentDTO> selectAllStudent();
}
