package com.example.demo.controller;

import com.example.demo.dto.QuestionPaper;
import com.example.demo.dto.Questions;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QuizController {

    @Autowired
    QuestionService questionService;


    @GetMapping("/processForm")
    public String processForm(){
        return "showQuiz";
    }

    @RequestMapping("/generateQuiz")
    public String generateQuiz( Model model1,Model model2){
        List<Questions> questionList=questionService.generateQuiz();
        QuestionPaper questionPaper=new QuestionPaper();
        questionPaper.setQuestions(questionList);
        model1.addAttribute("questionPaper",questionPaper);
        return "quizpage";
    }


    @RequestMapping("/answerForm")
    public String answerForm(@ModelAttribute ("questionPaper") QuestionPaper questionPaper, Model model) {
      List<Questions> questions =questionPaper.getQuestions();
      int score=0;
      int MaxScore=0;
      for(Questions q: questions){
          if((q.getCorrectanswer().equals(q.getUseranswer()))){
              score++;
          }
          MaxScore++;
      }
      model.addAttribute("MaxScore",MaxScore);
      model.addAttribute("score",score);
      return "result";
    }

}
