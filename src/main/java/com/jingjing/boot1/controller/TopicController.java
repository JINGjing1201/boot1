package com.jingjing.boot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TopicController {
    @RequestMapping("/topic")
    public String into(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name", name);
        return "Topic";
    }

}
