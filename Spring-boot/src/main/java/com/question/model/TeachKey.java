package com.question.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeachKey implements Serializable {
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "instructor_id")
    private Integer instructorId;
}
