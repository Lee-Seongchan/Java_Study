package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// 출발지점
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

}

// ** 회원관리
// * 1. 회원가입
// * 2. 회원정보 조회
// * 3. 회원정보 변경
// * 4. 회원정보 삭제

// ** 상품관리
// * 1. 상품등록
// * 2. 상품 조회
// * 3. 상품정보 변경
// * 4. 상품 삭제

// ** 주문관리
// * 1. 주문
// * 2. 주문 조회
// * 3. 주문 변경
// * 4. 주문 취소

// ** 배송관리
// * 1. 배송 시작
// * 2. 배송 조회
// * 3. 주문 취소
// * 4. 및 배송 철회

