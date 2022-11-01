package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.dto.MemberDto;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional // 변경사항에 대한 저장
@Service
public class MemberService {

    @Autowired  // 자동 완성 기능이 아니라 자동으로 매핑
    private MemberRepository memberRepository;

    public void insertMember(MemberDto dto)
    {
        memberRepository.insertMember(new Member(dto.getUsername()));
    }

    public List<Member> findAll()
    {
        return memberRepository.findAll();
    }

}
