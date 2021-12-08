package com.question.services.keyword;

import com.question.model.Keyword;

import java.util.List;

public interface IKeywordService {
    List<Keyword> getKeywordByQuestionId(Integer questionId);
}
