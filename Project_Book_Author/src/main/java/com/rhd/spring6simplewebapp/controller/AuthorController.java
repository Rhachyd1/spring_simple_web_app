package com.rhd.spring6simplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhd.spring6simplewebapp.services.AuthorService;

@Controller
public class AuthorController {
    

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @RequestMapping("/author")
    public String getAllAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
