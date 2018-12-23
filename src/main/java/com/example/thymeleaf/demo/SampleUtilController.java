package com.example.thymeleaf.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Date;

@Controller
public class SampleUtilController {

    @GetMapping("/sample7")
    public void sample7(Model model) {
        model.addAttribute("now", new Date());
        model.addAttribute("price", 123456789);
        model.addAttribute("title", "This is a just sample.");
        model.addAttribute("options", Arrays.asList("AAAA","BBB","CCC","DDD"));
    }
}
