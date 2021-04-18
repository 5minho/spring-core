package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private final int discountAmount;

    public FixDiscountPolicy(int discountAmount) { this.discountAmount = discountAmount; }

    @Override
    public int discount(Member member, int price) {
        return member.isVip() ? discountAmount : 0;
    }
}
