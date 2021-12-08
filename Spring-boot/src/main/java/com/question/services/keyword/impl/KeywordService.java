package com.question.services.keyword.impl;

import com.question.model.Keyword;
import com.question.repository.IKeywordRepository;
import com.question.services.keyword.IKeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService implements IKeywordService {

    @Autowired
    private IKeywordRepository iKeywordRepository;

    @Override
    public List<Keyword> getKeywordByQuestionId(Integer questionId) {
        return this.iKeywordRepository.getKeywordByQuestionId(questionId);
    }
}
