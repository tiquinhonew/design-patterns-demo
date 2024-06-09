package com.dam.builder;

public class FastFoodMealBuilder {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder() {
    }

    public FastFoodMealBuilder withDrink(final String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder withMain(final String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder withSide(final String side) {
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder withDessert(final String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder withGift(final String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal build() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }

}
