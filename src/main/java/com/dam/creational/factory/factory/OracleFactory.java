package com.dam.creational.factory.factory;

import com.dam.creational.factory.db.DB;
import com.dam.creational.factory.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
