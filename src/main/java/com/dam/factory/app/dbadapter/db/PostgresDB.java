package com.dam.factory.app.dbadapter.db;

public class PostgresDB implements DB {

    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Update query " + sql + " in Postgres database");
    }
}
