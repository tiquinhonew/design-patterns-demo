package com.dam.creational.factory.db;

public interface DB {
    void query(String sql);
    void update(String sql);
}
