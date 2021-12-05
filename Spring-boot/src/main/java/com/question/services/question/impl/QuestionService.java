package com.question.services.question.impl;

import com.question.model.Question;
import com.question.repository.IQuestionRepository;
import com.question.services.question.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService implements IQuestionService {
    @Autowired
    private IQuestionRepository iQuestionRepository;

    @Override
    public List<Question> getAllQuestion() {
        return this.iQuestionRepository.findAll();
    }

    @Override
    public Question getQuestionById(int id) {
        return this.iQuestionRepository.findById(id).orElse(null);
    }


    @Override
    public List<Question> getQuestionByQuestionType(String questionType) {
        return this.iQuestionRepository.getQuestionByQuestionType(questionType);
    }

    @Override
    public Question getQuestionByQuestionTypeAndId(String questionType, Integer id) {
        return this.iQuestionRepository.getQuestionByQuestionTypeAndId(questionType, id);
    }

    @Override
    public Question findQuestionById(Integer id) {
        return this.iQuestionRepository.findQuestionById(id);
    }
}
