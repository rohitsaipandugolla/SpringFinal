package com.example.demo.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

    @Before("com.example.demo.aspect.AspectExpressions.forGenerateQuiz()")
    public void beforeGenerateQuiz(){
        System.out.println("\n====>>> Executing @Before annotation before generating quiz");
    }

    @After("com.example.demo.aspect.AspectExpressions.forGenerateQuiz()")
    public void afterGenerateQuiz(){
        System.out.println("\n====>>> Executing @After annotation after generating quiz");
    }

    @Before("com.example.demo.aspect.AspectExpressions.forChangeRole()")
    public void beforeChangeRole(){
        System.out.println("\n====>>> Executing @Before annotation before changing role");
    }

    @AfterReturning("com.example.demo.aspect.AspectExpressions.forChangeRole()")
    public void afterChangeRole(){
        System.out.println("\n====>>> Executing @AfterReturning annotation after changing role");
    }

}

