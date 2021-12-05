package com.question.repository;

import com.question.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IQuestionRepository extends JpaRepository<Question,Integer> {
    @Query(value = "select * \n" +
            "from question\n" +
            "inner join question_type on question.question_type_id = question_type.question_type_id\n" +
            "where question_type_name = ?1" , nativeQuery = true)
    List<Question> getQuestionByQuestionType(String questionType);

    @Query(value = "select *\n" +
            "from question\n" +
            "inner join question_type on question.question_type_id =question_type.question_type_id\n" +
            "where question_type_name like ?1 \n" +
            "limit ?2,1 " , nativeQuery = true)
    Question getQuestionByQuestionTypeAndId(String questionType,Integer id);
    @Query(value = "select *\n" +
            "from question\n" +
            "inner join question_type on question.question_type_id =question_type.question_type_id\n" +
            "limit ?1,1",nativeQuery = true)
    Question findQuestionById(Integer id);

}
