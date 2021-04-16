package me.minho.springlecture.service;

import me.minho.springlecture.domain.Member;
import me.minho.springlecture.domain.MemberGrade;
import me.minho.springlecture.repository.MemberRepository;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(String id, MemberGrade grade) {
        Member member = new Member(id, grade);
        memberRepository.save(member);
    }

    public Member find(String id) {
        return memberRepository.find(id);
    }
}
