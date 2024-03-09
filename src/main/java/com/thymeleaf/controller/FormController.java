package com.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf.model.UserForm;

@Controller
public class FormController {

    // hander to handle the registration form

    @GetMapping("register")
    public String userForm(Model model){

        // empty userForm model object to store form data
        UserForm userForm = new UserForm(null, null, null, null, null, false, null);
        model.addAttribute("userForm", userForm);

        List<String> listProfession = Arrays.asList("developer", "tester", "archecter");
        model.addAttribute("listProfession", listProfession);

        return "register-form";
    }

    // handler to handle the register form submission

    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm){
        model.addAttribute("userForm", userForm);
        return "form-save";
    }
    
}
