package com.dam.creational.factory;

import com.dam.creational.factory.db.DB;
import com.dam.creational.factory.factory.OracleFactory;

public class Client {

    public static void main(String[] args) {
     // DB database = new PostgresFactory().getDatabase();
        DB database = new OracleFactory().getDatabase();
        database.query("SELECT * FROM users");
        database.update("INSERT INTO users VALUES ('John', 'Doe')");
    }
}
