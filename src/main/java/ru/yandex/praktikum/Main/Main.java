package ru.yandex.praktikum.Main;


import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.service.ShoppingCart;

import static ru.yandex.praktikum.model.constants.Colour.GREEN;
import static ru.yandex.praktikum.model.constants.Colour.RED;


public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100.0);
        Food redApple = new Apple(10, 50.0, RED);
        Food greenApple = new Apple(10, 50.0, GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.printf("Сумма товаров без скидки: %.2f%n", cart.getTotalPriceWithoutDiscount());
        System.out.printf("Сумма товаров со скидкой: %.2f%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма вегетарианских товаров: %.2f%n", cart.getTotalPriceIsVegetables());
    }
}





