package com.question.services.answer;

import com.question.model.Answer;

public interface IAnswerService {
    void save(Answer answer);
    Answer getAnswerByStudentIdAndQuestionId(Integer questionId , Integer studentId);
}
