package com.ohgiraffers.semistudy.service;

import com.ohgiraffers.semistudy.dto.StudentDTO;
import com.ohgiraffers.semistudy.model.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    private StudentDAO studentDAO;
    public List<StudentDTO> selectAllStudent() {
        List<StudentDTO> students = studentDAO.selectAllStudent();
        if (Objects.isNull(students)){
            System.out.println("asdasd");
        }
        return students;

    }
}
