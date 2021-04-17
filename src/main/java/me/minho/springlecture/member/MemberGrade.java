package me.minho.springlecture.member;

public enum MemberGrade {
    BASIC, VIP;

    public boolean isVip() {
        return this.equals(VIP);
    }
}
