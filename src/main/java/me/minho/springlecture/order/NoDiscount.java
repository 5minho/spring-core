package me.minho.springlecture.order;

public class NoDiscount implements Discount {
    @Override
    public int apply(int amount) {
        return amount;
    }
}
