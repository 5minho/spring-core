package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
