package com.choizeus02.demo.service;

import com.choizeus02.demo.repository.MemberRepository;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
}
