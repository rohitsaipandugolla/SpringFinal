package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionPaper {

    public QuestionPaper(){

    }

    List<Questions> questions =new ArrayList<>();


    @Override
    public String toString() {
        return "QuestionPaper{" +
                "questions=" + questions +
                '}';
    }
}