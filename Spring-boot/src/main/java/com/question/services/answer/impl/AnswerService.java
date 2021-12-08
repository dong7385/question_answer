package com.question.services.answer.impl;

import com.question.model.Answer;
import com.question.repository.IAnswerRepository;
import com.question.services.answer.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService implements IAnswerService {
    @Autowired
    private IAnswerRepository iAnswerRepository;

    @Override
    public void save(Answer answer) {
        this.iAnswerRepository.save(answer);
    }

    @Override
    public Answer getAnswerByStudentIdAndQuestionId(Integer questionId, Integer studentId) {
        return this.iAnswerRepository.getAnswerByStudentIdAndQuestionId(questionId, studentId);
    }

}
