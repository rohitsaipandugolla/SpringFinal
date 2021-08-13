
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home(){
        return new ModelAndView("homepage");
    }


    @RequestMapping("/admin")
    public ModelAndView admin(){
        return new ModelAndView("admin");
    }

}


