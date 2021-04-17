package me.minho.springlecture.order;

import java.util.HashMap;
import java.util.Map;

public class MemoryOrderRepository implements OrderRepository {
    private final Map<String, Order> store = new HashMap<>();

    @Override
    public void save(Order order) {
        store.put(order.getId(), order);
    }

    @Override
    public Order findById(String id) {
        return store.get(id);
    }
}
