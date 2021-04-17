package me.minho.springlecture.order;

public interface OrderService {
    String order(long memberId, Item item);
    Order findById(String orderId);
}
