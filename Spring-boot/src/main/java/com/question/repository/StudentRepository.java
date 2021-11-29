package com.question.repository;

import com.question.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student ", nativeQuery = true)
    Page<Student> getAllStudent(Pageable pageable);
}
