package com.question.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="question_type_id")
    private Integer questionTypeId;
    private String questionTypeName;
    @JsonBackReference
    @OneToMany(mappedBy = "questionType")
    private Set<Question> questionSet;
}
