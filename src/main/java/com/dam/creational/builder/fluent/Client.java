package com.dam.creational.builder.fluent;

public class Client {

        public static void main(String[] args) {
            FastFoodMeal meal = new FastFoodMealBuilder()
                    .withDrink("Coke")
                    .withMain("Cheeseburger")
                    .withSide("Fries")
                    .withDessert("Ice Cream")
                    .withGift("Toy")
                    .build();
            System.out.println(meal);
        }

}
