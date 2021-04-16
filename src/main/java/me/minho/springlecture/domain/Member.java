package me.minho.springlecture.domain;

public class Member {
    private String memberId;
    private MemberGrade grade;

    public Member(String memberId, MemberGrade grade) {
        this.memberId = memberId;
        this.grade = grade;
    }
}
