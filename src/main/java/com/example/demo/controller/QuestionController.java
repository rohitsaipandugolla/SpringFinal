package com.example.demo.controller;


import com.example.demo.entity.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public ModelAndView getAllQuestions(Model model){
        model.addAttribute("questions",questionService.getAllQuestions());
        return new ModelAndView("questions");
    }


    @GetMapping("/getQuestion/{id}")
    public Question getQuestion(@PathVariable(value = "id") Long questionId){
        return questionService.getQuestionById(questionId);
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/addQuestion")
    public ModelAndView enterQuestion(Model model,Question question){
        model.addAttribute("addquestion",question);
        return new ModelAndView("addQuestion");
    }

    @PostMapping("/saveQuestion")
    public ModelAndView saveQuestion(@Valid @ModelAttribute("addquestion") Question question, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("addQuestion");
        }
        questionService.createQuestion(question);
        System.out.println("Question is" + question);
        return new ModelAndView("redirect:/admin/questions");
    }

    @GetMapping(value = "/deleteQuestion/{id}")
    public ModelAndView deleteQuestion(@PathVariable Long id){
        questionService.deleteQuestion(id);
        return  new ModelAndView("redirect:/admin/questions");
    }

}
