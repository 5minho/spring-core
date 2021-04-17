package me.minho.springlecture.member;

public class Member {
    private String memberId;
    private MemberGrade grade;

    public Member(String memberId, MemberGrade grade) {
        this.memberId = memberId;
        this.grade = grade;
    }

    public String getMemberId() {
        return memberId;
    }
}
