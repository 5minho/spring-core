package me.minho.springlecture.member;

public class Member {
    private long memberId;
    private MemberGrade grade;

    public Member(long memberId, MemberGrade grade) {
        this.memberId = memberId;
        this.grade = grade;
    }

    public long getMemberId() {
        return memberId;
    }

    public boolean isVip() {
        return grade.isVip();
    }
}
