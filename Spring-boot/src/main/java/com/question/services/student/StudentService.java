package com.question.services.student;

import com.question.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface StudentService {
    Page<Student> getAllStudent(Pageable pageable);
}
