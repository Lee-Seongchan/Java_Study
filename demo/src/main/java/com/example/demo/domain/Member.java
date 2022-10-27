package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor // 기본 생성자 만들어준다.
@Entity
@Table(name = "Member") //name을 생략하면 class 이름이 기본적으로 들어가지만 name으로 지정할 수 있다.
public class Member {

    @Id @GeneratedValue //Entity를 쓰면 id는 필수이다 // GeneratedValue : key를 자동으로 넣어준다.
    private Long id;

    @Column(name = "NAME")
    private String userName;

    public Member(String userName)
    {
        this.userName =userName;
    }

}
