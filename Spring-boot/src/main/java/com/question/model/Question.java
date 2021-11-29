package com.question.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "question_content",length = 1000 )
    private String questionContent;
    @OneToMany(mappedBy = "question")
    private Set<Keyword> keywordSet;
    @ManyToOne
    @JoinColumn(name = "questionType_id")
    private QuestionType questionType;
}
