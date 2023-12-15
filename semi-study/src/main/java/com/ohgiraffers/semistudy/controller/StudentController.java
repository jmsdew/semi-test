package com.ohgiraffers.semistudy.controller;

import com.ohgiraffers.semistudy.dto.StudentDTO;
import com.ohgiraffers.semistudy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("students")
    public ModelAndView selectAllStudent(ModelAndView mv){
        List<StudentDTO> students = service.selectAllStudent();
        mv.addObject("students",students);
        mv.setViewName("main");
        return mv;
    }



}
