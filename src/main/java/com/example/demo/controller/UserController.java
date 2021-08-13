package com.example.demo.controller;

import com.example.demo.entity.Role;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class UserController {
    @Autowired
    UserService userService;



    @GetMapping("/users")
    public ModelAndView getAllUsers(Model model){
        model.addAttribute("users",userService.getAllUsers());
        List<String>roleList=new ArrayList<>();
        roleList.add("ROLE_ADMIN");
        roleList.add("ROLE_USER");
        Role role=new Role();
        model.addAttribute("roles",role);
        model.addAttribute("rolelist",roleList);
        return new ModelAndView("users");
    }


    @GetMapping(value = "/deleteUser/{id}")
    public ModelAndView deleteQuestion(@PathVariable Long id){
        userService.deleteUser(id);
        return  new ModelAndView("redirect:/admin/users");
    }

    @RequestMapping(value = "/updateRole/{id}")
    public ModelAndView updateRole(@ModelAttribute("roles") Role role,Model model,@PathVariable Long id){
        userService.changeRole(id,role);
        return  new ModelAndView("redirect:/admin/users");
    }

}




