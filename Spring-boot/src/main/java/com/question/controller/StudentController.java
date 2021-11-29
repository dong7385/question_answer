package com.question.controller;


import com.question.model.Student;
import com.question.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("")
    public String getAllStudent(@PageableDefault(value = 2) Pageable pageable, Model model) {
        Page<Student> students = studentService.getAllStudent(pageable);
        model.addAttribute("students",students);
        return "student/student";
    }
}
