package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;

import java.util.UUID;

public class Order {
    private String id;

    private Member member;

    private Item item;

    private int orderPrice;

    public static Order createOrder(Member member, Item item, Discount discount) {
        Order order = new Order();
        order.id = UUID.randomUUID().toString();
        order.member = member;
        order.item = item;
        order.orderPrice = item.applyDiscount(discount);
        return order;
    }

    public String getId() { return id; }

    public Member getMember() {
        return member;
    }

    public Item getItem() {
        return item;
    }

    public int getOrderPrice() {
        return orderPrice;
    }
}
