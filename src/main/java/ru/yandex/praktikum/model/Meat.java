package ru.yandex.praktikum.model;

public class Meat extends Food {
    public Meat (int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public Double getDiscount() {
        return 0.0;
    }
}
