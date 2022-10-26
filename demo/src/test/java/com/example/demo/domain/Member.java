package com.example.demo.domain;

import javax.persistence.*;

//@NoArgsConstructor //기본 생성자 자동 생성
@Entity //JPA를 추가했기 때문에 사용가능
public class Member {

    @Id @GeneratedValue //key를 자동생성.
    private Long id;

    @Column(name = "NAME")
    private String userName;

}
