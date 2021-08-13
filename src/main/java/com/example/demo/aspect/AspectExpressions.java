package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectExpressions {

    @Pointcut("execution(* com.example.demo.service.QuestionService.generateQuiz(..))")
    public void forGenerateQuiz() {

    }

    @Pointcut("execution(* com.example.demo.service.UserService.changeRole(..))")
    public void forChangeRole(){

    }

}
