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
    private String username;

    /*


    @Column(name = "AGE")
    private Integer age;
    // int와 차이점 null값 대입 가능 사칙연산 불가능
    @Column(name = "EMAIL")
    private String email;

     */

    public Member(String username)
    {
        this.username =username;
       // this.age = age;
        //this.email = email;
    }


}

// ** [영속성]

// ** 영속 : EntitiyManager에 포함된 상태
// ** 비 영속 :  EntitiyManager에 포함되기 전 상태
// ** 준 영속 :  EntitiyManager에 포함되었었고 현재는 포함되지 않은 상태
// ** 삭제 : 삭제된 상태

// 영속성
// 1 .영속적상태 : 영구적으로 지속적 되는 상태
// 2. 비영속성상태 : 영구적으로 지속되지 않은 상태
// 3. 준영속성상태 : 영속 상태였는데 지금은 아님
// 4. 삭제된 상태

