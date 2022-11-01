package com.example.demo.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter

public class MemberDto {

    private String username;
    @NonNull
    public MemberDto()
    {
        this.username = username;

    }



}
