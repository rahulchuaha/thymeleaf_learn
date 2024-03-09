package com.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.model.User;

@Controller
public class UserController {

    // handler methode to handle the variable expression 

    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("rahul", "rahulchauhan572000@gmail.com", "user", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // handler to handle the selection expression

    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("rahul", "rahul@gmail.com", "Admin", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handler to handle the message expression

    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    // handler to handle the link expression

    // @GetMapping("link-expression")
    // public String linkExpression(){
    //     return "link-expression";
    // }

    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handler to handle the fragement-expression

    @GetMapping("fragement-expression")
    public String fragnentExpression(){
        return "fragement-expression";
    }
    // handler to handle the loop or itration

    @GetMapping("/users")
    public String users(Model model){

        User admin = new User("admin", "admin@gmail.com", "ADMIN", "male");
        User rahul = new User("rahul", "rahul@gmail.com", "user", "male");
        User meena = new User("meena", "meena@gmail.com", "user", "female");

        List<User> users = new ArrayList<>();

        users.add(admin);
        users.add(rahul);
        users.add(meena);

        model.addAttribute("users", users);

        return "users";
        }

        //handler to handle the if unless

        @GetMapping("/if-unless")
        public String ifUnless(Model model){

            User admin = new User("admin", "admin@gmail.com","ADMIN", "male");
            User rahul = new User("rahul","rahul@gmail.com", "USER", "male");
            User meena = new User("meena", "meena@gmail.com", "User", "female");

            List<User> users = new ArrayList<>();
            users.add(admin);
            users.add(rahul);
            users.add(meena);

            model.addAttribute("users", users);

            return "if-unless";
        }

        // handler to handle the switch case attribute for thymeleaf

        @GetMapping("/switch-case")
        public String switchCase(Model model){

            User user = new User("rahul", "rahul@gmail.com", "GEEST", "male");
            model.addAttribute("user", user);

            return "switch-case";
        }
}
