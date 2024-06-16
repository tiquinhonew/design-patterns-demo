package com.dam.creational.prototype.deepshallow.model;

public class Address implements Cloneable {

    public String street;
    public Integer number;

    public Address(final String street, final Integer number) {
        super();
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", number=" + number + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
