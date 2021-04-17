package me.minho.springlecture.order;

public class FixedAmountDiscount implements Discount {
    private final int discountAmount;

    public FixedAmountDiscount(int discountAmount) { this.discountAmount = discountAmount; }

    @Override
    public int apply(int amount) {
        return Math.max(amount - discountAmount, 0);
    }
}
