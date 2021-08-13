package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String question;

    public Question(){

    }

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option1;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option2;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option3;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option4;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String correctanswer;

    public Question(String question,String option1, String option2, String option3, String option4, String correctanswer) {
        this.question=question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctanswer = correctanswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", correctanswer='" + correctanswer + '\'' +
                '}';
    }
}