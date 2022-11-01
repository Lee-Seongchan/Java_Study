package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


//DB와 연관되어 있어 복합적인 기능 수행X -> 복합적인 기능은 서비스에서 수행함.
@Repository
public class MemberRepository  {

    @PersistenceContext
    private EntityManager em;

    public void insertMember(Member member)
    {
        em.persist(member);
    }

    public List<Member> findAll()
    {
        return em.createQuery("select m from Member m", Member.class).getResultList();


    }

}
