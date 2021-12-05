package com.question.services.question;

import com.question.model.Question;

import java.util.List;

public interface IQuestionService {
    List<Question> getAllQuestion();
    Question getQuestionById(int id);
    List<Question> getQuestionByQuestionType(String questionType);
  Question getQuestionByQuestionTypeAndId(String questionType,Integer id);
    Question findQuestionById(Integer id);

}
