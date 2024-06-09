package com.dam.builder;

public class FastFoodMeal {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(final String drink) {
        this.drink = drink;
    }

    public String getMain() {
        return main;
    }

    public void setMain(final String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(final String side) {
        this.side = side;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(final String dessert) {
        this.dessert = dessert;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(final String gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
            "drink='" + drink + '\'' +
            ", main='" + main + '\'' +
            ", side='" + side + '\'' +
            ", dessert='" + dessert + '\'' +
            ", gift='" + gift + '\'' +
            '}';
    }

}
