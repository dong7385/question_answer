package com.question.restcontroller;

import com.question.model.Question;
import com.question.services.question.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/question")
public class QuestionRestController {
    @Autowired
    private IQuestionService iQuestionService;
    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestion(){
        List<Question> questionList = this.iQuestionService.getAllQuestion();
        return new ResponseEntity(questionList, HttpStatus.OK);
    }
    @GetMapping("/{questionType}")
    public  ResponseEntity<List<Question>> getQuestionByQuestionType(@PathVariable String questionType){
        List<Question> questionList = this.iQuestionService.getQuestionByQuestionType(questionType);
        return new ResponseEntity(questionList,HttpStatus.OK);
    }
    @GetMapping("/{questionType}/{id}")
    public  ResponseEntity<List<Question>> getQuestionByQuestionTypeAndId(@PathVariable String questionType,@PathVariable Integer id){
        Question question;
       if ( "all".equals(questionType)){
           question = this.iQuestionService.findQuestionById(id);
       }else{
          question = this.iQuestionService.getQuestionByQuestionTypeAndId('%'+questionType +'%', id);
       }
        return new ResponseEntity(question,HttpStatus.OK);
    }

}
