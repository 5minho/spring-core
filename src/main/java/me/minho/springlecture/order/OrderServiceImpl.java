package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;
import me.minho.springlecture.member.MemberService;

public class OrderServiceImpl implements OrderService, DiscountService {
    private final OrderRepository orderRepository = new MemoryOrderRepository();

    public OrderServiceImpl(MemberService memberService) {
        this.memberService = memberService;
    }

    private final MemberService memberService;

    @Override
    public String order(long memberId, Item item) {
        Member member = memberService.findMember(memberId);
        Order order = Order.createOrder(member, item, getDiscount(member));
        orderRepository.save(order);
        return order.getId();
    }

    @Override
    public Order findById(String orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public Discount getDiscount(Member member) {
        return member.isVip() ? new FixedAmountDiscount(1000) : new NoDiscount();
    }
}
