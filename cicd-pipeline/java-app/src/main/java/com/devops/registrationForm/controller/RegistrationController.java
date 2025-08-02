package com.devops.registrationForm.controller;

import com.devops.registrationForm.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class RegistrationController {

    private List<User> registeredUsers = new ArrayList<>();

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user, Model model) {
        registeredUsers.add(user);
        model.addAttribute("message", "Successfully Registered!");
        return "success";
    }

    @GetMapping("/users")
    public String viewUsers(Model model) {
        model.addAttribute("users", registeredUsers);
        return "userlist";
    }
}
