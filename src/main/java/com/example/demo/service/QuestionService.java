package com.example.demo.service;

import com.example.demo.dto.Questions;
import com.example.demo.entity.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }


    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow();
    }


    public void createQuestion(Question question) {
         questionRepository.save(question);
    }

    public void deleteQuestion(Long questionId) {
        questionRepository.deleteById(questionId);
    }

    public List<Questions> generateQuiz() {
        List<Question> questions = questionRepository.findAll();
        List<Questions>qusList=new ArrayList<>();
        for(Question question:questions){
            Long id=question.getId();
            String qus=question.getQuestion();
            String option1=question.getOption1();
            String option2=question.getOption2();
            String option3=question.getOption3();
            String option4=question.getOption4();
            String correctanswer=question.getCorrectanswer();
            Questions qus1=new Questions(id,qus,option1,option2,option3,option4,correctanswer);
            if(!qusList.contains(qus1)){
                qusList.add(qus1);
            }
        }
        return qusList;
    }

}
