package me.minho.springlecture.order;

import me.minho.springlecture.member.Member;

import java.util.UUID;

public class Order {
    private String id;

    private Member member;

    private Item item;

    private int itemPrice;

    private int discountPrice;

    public static Order createOrder(Member member, Item item, int discountPrice) {
        Order order = new Order();
        order.id = UUID.randomUUID().toString();
        order.member = member;
        order.item = item;
        order.itemPrice = item.getPrice();
        order.discountPrice = discountPrice;
        return order;
    }

    public String getId() { return id; }

    public Member getMember() {
        return member;
    }

    public Item getItem() {
        return item;
    }

    public int calculateOrderPrice() {
        return itemPrice - discountPrice;
    }
}
