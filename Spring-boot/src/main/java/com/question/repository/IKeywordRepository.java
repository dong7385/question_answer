package com.question.repository;

import com.question.model.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKeywordRepository extends JpaRepository<Keyword,Integer> {


    @Query(value ="select *\n" +
            "from keyword\n" +
            "where question_id = ?1" ,nativeQuery = true)
    List<Keyword> getKeywordByQuestionId(Integer questionId);
}
