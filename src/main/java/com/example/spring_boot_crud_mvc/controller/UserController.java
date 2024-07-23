package com.example.spring_boot_crud_mvc.controller;

import com.example.spring_boot_crud_mvc.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String userPage(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        var user = (User) auth.getPrincipal();
        model.addAttribute("user", user);

        model.addAttribute("currentPath", "/user");
        return "user";
    }

}
