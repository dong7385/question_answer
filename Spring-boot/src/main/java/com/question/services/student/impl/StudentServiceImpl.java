package com.question.services.student.impl;

import com.question.model.Student;
import com.question.repository.StudentRepository;
import com.question.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Page<Student> getAllStudent(Pageable pageable) {
        return studentRepository.getAllStudent(pageable);
    }
}
