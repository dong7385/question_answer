package com.question.repository;

import com.question.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnswerRepository extends JpaRepository<Answer, Integer> {
    @Query(value = "select * " +
            " from answer " +
            " join student on answer.student_id = student.student_id " +
            " join question on answer.question_id = question.question_id " +
            " join question_type on question.question_type_id = question_type.question_type_id " +
            " join keyword on question.question_id = keyword.question_id " +
            " where student.student_id = ?1 ", nativeQuery = true)
    Answer getByIdStudentOfAnswer(Integer id);

    @Query(value = "select * from answer where question_id = ?1 and student_id = ?2",nativeQuery = true)
    Answer getAnswerByStudentIdAndQuestionId(Integer questionId , Integer studentId);

}
