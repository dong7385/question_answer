package com.question.restcontroller;

import com.question.model.Answer;
import com.question.model.Keyword;
import com.question.services.answer.IAnswerService;
import com.question.services.keyword.IKeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/answer")
public class AnswerRestController {
    @Autowired
    private IAnswerService iAnswerService;
    @Autowired
    private IKeywordService iKeywordService;

    @GetMapping("/{answerContent}/{questionId}")
    public ResponseEntity<Answer> getKeywordMissingByAnswer(@PathVariable String answerContent, @PathVariable Integer questionId) {
        List<Keyword> keywordList = this.iKeywordService.getKeywordByQuestionId(questionId);

        String words[] = answerContent.split("\\s");
        String keywordMissing = "";
        for (int i = 0; i < keywordList.size() - 1; i++) {
            boolean check = false;
            for (int j = 0; j < words.length; j++) {
                if (keywordList.get(i).equals(words[i])) {
                    check = true;
                }
            }
            if (check == false) {
                keywordMissing += keywordList.get(i) + ",";
            }
        }
        Answer answer = this.iAnswerService.getAnswerByStudentIdAndQuestionId(1, 1);
        if (answer != null) {
            ///call store procedure update
        }
///call store procedure inser into
        return new ResponseEntity(answer, HttpStatus.OK);
    }
}
