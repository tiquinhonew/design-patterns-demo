package com.dam.creational.prototype.deepshallow;

import com.dam.creational.prototype.deepshallow.model.Address;
import com.dam.creational.prototype.deepshallow.model.User;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Alameda Mustache", 123);
        User user = new User("John", 30, address);

        User clonedUser = user.clone();
        clonedUser.name = "Jane";
        clonedUser.age = 25;
        clonedUser.address.street = "Alameda Beard";
        clonedUser.address.number = 456;

        System.out.println("Original user: " + user);
        System.out.println("Cloned user: " + clonedUser);
    }

}
