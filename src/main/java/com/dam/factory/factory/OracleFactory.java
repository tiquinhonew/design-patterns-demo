package com.dam.factory.factory;

import com.dam.factory.db.DB;
import com.dam.factory.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
