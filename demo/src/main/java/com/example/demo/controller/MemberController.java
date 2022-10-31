package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller //컨트롤러나 서비스와 같은 계층을 먼저 나누어 놓는다. -> 계층생성
public class MemberController {

    // view와 관련된 것들...
    @Autowired
    private MemberService memberService;


    @GetMapping("new") // Controller에서 new를 입력을 할 것인가 안 할것인가.... //localhost:8080/new에서 new와 동일
    public String newMember()
    {
        /*
        Member member = new Member("홍길동");
        memberRepository.save(member);
        //save는 레퍼지토리 변경사항이 있으면 db에 저장
        System.out.println("createMember");
         */
        return "new";
    }

    //@GetMapping("create") 참조만 가능
    @PostMapping("create")  //참조뿐만 아니라 변경도 가능
    public String createMember(Member member)
    {
        //Member member = new Member("홍길동"); // 임시의 데이터
        memberService.insertMember(member);


        //추가
        return "create";
    }



}
