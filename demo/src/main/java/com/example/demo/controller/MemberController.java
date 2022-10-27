package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;


    @GetMapping("new")
    public String newMember()
    {
        return "new";
    }

    //@GetMapping("create") 참조만 가능
    @PostMapping("create")  //참조뿐만 아니라 변경도 가능
    public String createMember()
    {
        Member member = new Member("홍길동");
        memberRepository.save(member);
        System.out.println("createMember");
        return "";
    }



}
