package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.webapp.service.ToDoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final ToDoService todoService;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("todos", todoService.findAll());
        return "todos/index";
    }

    @RequestMapping("/form")
    public String form(Model model) {
        return "todos/form";
    }

}
