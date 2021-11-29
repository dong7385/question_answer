package com.question.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
    @EmbeddedId
    private AnswerKey answerId;
    private Date createDate;
    @Column(name = "answer_content",length = 2000)
    private String answerContent;
    private String keywordMissing;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @MapsId("question_id")
    @JoinColumn(name = "question_id")
    private Question question;
}
