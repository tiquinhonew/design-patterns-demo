package com.dam.factory.app.dbadapter;

import com.dam.factory.app.dbadapter.db.DB;
import com.dam.factory.app.dbadapter.factory.OracleFactory;

public class Client {

    public static void main(String[] args) {
     // DB database = new PostgresFactory().getDatabase();
        DB database = new OracleFactory().getDatabase();
        database.query("SELECT * FROM users");
        database.update("INSERT INTO users VALUES ('John', 'Doe')");
    }
}
