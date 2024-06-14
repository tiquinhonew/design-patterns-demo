package com.dam.prototype.deepshallow.model;

public class User implements Cloneable {

    public String name;
    public Integer age;
    public Address address;

    public User(final String name, final Integer age, final Address address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        // Shallow clone (only the object itself, not the objects it references)
        // return super.clone();

        // Deep clone (the object itself and the objects it references are cloned as Address here is also cloneable)
        User cloneUser = (User) super.clone();
        cloneUser.address = (Address) cloneUser.address.clone();
        return cloneUser;
    }

}
