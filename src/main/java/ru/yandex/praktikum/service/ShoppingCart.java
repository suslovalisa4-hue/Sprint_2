package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double countPrice = 0;
        for (Food food : foods) {
            countPrice += food.getPrice() * food.getAmount();
        }
        return countPrice;

    }

    public double getTotalPriceWithDiscount() {
        double countPrice = 0;
        for (Food food : foods) {
            countPrice += (food.getPrice() - discountSum(food)) * food.getAmount();
        }
        return countPrice;

    }

    private double discountSum(Food food) {
        return food.getPrice() / 100 * food.getDiscount();
    }

    public double getTotalPriceIsVegetables() {
        double countPrice = 0;
        for (Food food : foods) {
            if (food.getVegetarian()) {
                countPrice += food.getPrice() * food.getAmount();
            }
        }
        return countPrice;
    }

}


