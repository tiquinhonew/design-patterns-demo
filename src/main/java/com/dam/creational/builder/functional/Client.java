package com.dam.creational.builder.functional;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burgerCombo = new FastFoodMeal.Builder()
            .withDrink("Coke")
            .withMain("Cheeseburger")
            .withSide("Fries")
            .withDessert("Ice Cream")
            .withGift("Toy")
            .build();
        System.out.println(burgerCombo);

        FastFoodMeal justFries = new FastFoodMeal.Builder().build();
        System.out.println(justFries);

        FastFoodMeal heartAttackCombo = new FastFoodMeal.Builder()
            .withDrink("Milk Shake")
            .withMain("Monster Burger")
            .withSide("Onion Rings")
            .withDessert("Fried Cheese Cake")
            .withGift("Heartburn")
            .build();
        System.out.println(heartAttackCombo);
    }
}

