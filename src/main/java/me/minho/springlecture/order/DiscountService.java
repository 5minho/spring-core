package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;

public interface DiscountService {
    Discount getDiscount(Member member);
}
