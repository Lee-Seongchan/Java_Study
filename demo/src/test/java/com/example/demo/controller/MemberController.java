package com.example.demo.controller;

import com.example.demo.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class MemberController {

    EntityManager em;

    @GetMapping("hello")
    public Long insert(Member member)
    {
        em.persist(member);

        return 1L;
    }

}
