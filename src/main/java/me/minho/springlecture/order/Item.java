package me.minho.springlecture.order;

public class Item {
    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int applyDiscount(Discount discount) {
        return discount.apply(this.price);
    }
}