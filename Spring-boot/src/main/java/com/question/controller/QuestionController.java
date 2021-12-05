package com.question.controller;

import com.question.services.question.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {
@Autowired
private IQuestionService iQuestionService;
    @GetMapping("")
    public String questionPage(){
        return "question/question";
    }
}
