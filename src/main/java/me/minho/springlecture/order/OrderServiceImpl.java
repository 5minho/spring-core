package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;
import me.minho.springlecture.member.MemberService;

public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final DiscountPolicy discountPolicy;
    private final MemberService memberService;

    public OrderServiceImpl(MemberService memberService,
                            DiscountPolicy discountPolicy,
                            OrderRepository orderRepository) {
        this.memberService = memberService;
        this.discountPolicy = discountPolicy;
        this.orderRepository = orderRepository;
    }

    @Override
    public String order(long memberId, Item item) {
        Member member = memberService.findMember(memberId);
        Order order = Order.createOrder(member, item, discountPolicy.discount(member, item.getPrice()));
        orderRepository.save(order);
        return order.getId();
    }

    @Override
    public Order findById(String orderId) {
        return orderRepository.findById(orderId);
    }
}
