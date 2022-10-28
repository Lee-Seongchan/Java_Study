package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor // 기본 생성자 만들어준다.
@Entity //엔터티에 들어갈 테이블의 이름을 멤버로 해라...
@Table(name = "Member") //name을 생략하면 class 이름이 기본적으로 들어가지만 name으로 지정할 수 있다.
public class Member {

    @Id @GeneratedValue //Entity를 쓰면 id는 필수이다 // GeneratedValue : key를 자동으로 넣어준다.
    private Long id;

    @Column(name = "NAME")
    private String userName;
    @Column(name = "AGE")
    private Integer age;
    // int와 차이점 null값 대입 가능 사칙연산 불가능
    @Column(name = "EMAIL")
    private String email;

    public Member(String userName,int age, String email)
    {
        this.userName =userName;
        this.age = age;
        this.email = email;
    }


}
