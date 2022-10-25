package com.example.demo.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("hello")
    public String hello(Model model)
    {
        Member member = new Member();
        member.setUsername("홍길동");

        model.addAttribute("data", member.getUsername());

        return "hello";
    }
}
