package ru.yandex.praktikum.model;

import java.util.Objects;

import static ru.yandex.praktikum.model.constants.Colour.RED;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_FOR_ALL;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends Food {
    private final String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public Double getDiscount() {
        return Objects.equals(color, RED) ?
                DISCOUNT_FOR_RED_APPLE : DISCOUNT_FOR_ALL;
    }
}