package com.question.restcontroller;

import com.question.model.Answer;
import com.question.services.answer.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/answer")
public class AnswerRestController {
    @Autowired
    private IAnswerService iAnswerService;
    @GetMapping("/{answerContent}/{idAnswer}")
    public ResponseEntity<Answer> getKeywordMissingByAnswer(@PathVariable String answerContent, @PathVariable Integer idAnswer){
        System.out.println(answerContent);
        System.out.println(idAnswer);
        return new ResponseEntity(HttpStatus.OK);
    }
}
