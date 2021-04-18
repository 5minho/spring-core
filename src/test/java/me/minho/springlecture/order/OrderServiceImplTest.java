package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;
import me.minho.springlecture.member.MemberGrade;
import me.minho.springlecture.member.MemberService;
import me.minho.springlecture.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceImplTest {

    @Test
    public void vipOrderTest() {
        // given
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl(memberService, new FixDiscountPolicy(1000), new MemoryOrderRepository());
        Member member = new Member(1L, MemberGrade.VIP);
        Item item = new Item("라면", 5000);
        memberService.join(member);

        // when
        String orderId = orderService.order(1L, item);

        // then
        Order order = orderService.findById(orderId);
        assertThat(order.getItem()).isEqualTo(item);
        assertThat(order.calculateOrderPrice()).isEqualTo(4000);
        assertThat(order.getMember()).isEqualTo(member);
    }

}