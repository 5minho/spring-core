package me.minho.springlecture.order;

public interface OrderRepository {
    void save(Order order);
    Order findById(String id);
}
