package com.dam.factory.app.dbadapter.factory;

import com.dam.factory.app.dbadapter.db.DB;
import com.dam.factory.app.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
