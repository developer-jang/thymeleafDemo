package com.example.thymeleaf.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public void sample(Model model) {
//        model.addAttribute("greeting", "Hello world");
        model.addAttribute("greeting", "Merry Christmas");
    }

    @GetMapping("/sample2")
    public void  sample2(Model model) {
        MemberVO memberVO =
                new MemberVO(123, "u00", "p00", "jangjh", new Timestamp(System.currentTimeMillis()));
        model.addAttribute("memberVO", memberVO);
    }

    @GetMapping("/sample3")
    public void sample3(Model model) {
        List<MemberVO> memberVOList = new ArrayList<>();

        for(int i=0; i<10; i++) {
            memberVOList.add(new MemberVO(123, "u0" + i, "p0" + i, "jangjh" + i, new Timestamp(System.currentTimeMillis())));
        }
        model.addAttribute("memberVOList", memberVOList);
    }

    @GetMapping("/sample7")
    public void sample7(Model model) {
        model.addAttribute("now", new Date());
        model.addAttribute("price", 123456789);
        model.addAttribute("title", "This is a just sample.");
        model.addAttribute("options", Arrays.asList("AAAA","BBB","CCC","DDD"));
    }

    @GetMapping("/sample8")
    public void sample8(Model model) {

    }
}
