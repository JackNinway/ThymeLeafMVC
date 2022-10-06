package com.example.thymeleafmvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
    List<String> stringList = new ArrayList<>();

    @GetMapping("/index")
    public String index() {
        return ("index");
    }
    @GetMapping("/contact")
    public String contact(){
        return ("contact");
    }
    @PostMapping("/contact")
    public String contact(@RequestParam String fname){
        System.out.println("From Controller using @PostMapping");
        stringList.add(fname);
        return ("contact");
    }
    @GetMapping("/contactList")
    public String contactList(Model model){
        String testString = "myTestString from contact Controller";
        model.addAttribute("inputText", stringList);
        return ("contactList") ;
    }
}
