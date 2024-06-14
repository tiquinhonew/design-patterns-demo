package com.dam.prototype.functionalclonebuilder;

import com.dam.prototype.functionalclonebuilder.model.Address;
import com.dam.prototype.functionalclonebuilder.model.User;

public class Client {

    public static void main(String[] args) {
        User user = new User("Origem", 25, new Address("ABC Street", 1000));
        User cloneUser = user.cloneBuilder().withName("Cloned").now();
        User anotherUser = cloneUser.cloneBuilder()
            .withAge(100)
            .withAddress(new Address("A Street", 500))
            .now();

        System.out.println(cloneUser);
        System.out.println(user);
        System.out.println(anotherUser);
    }
}
