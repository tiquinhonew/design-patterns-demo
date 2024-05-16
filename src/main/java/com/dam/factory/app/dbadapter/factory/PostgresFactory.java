package com.dam.factory.app.dbadapter.factory;

import com.dam.factory.app.dbadapter.db.DB;
import com.dam.factory.app.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

        @Override
        public DB getDatabase() {
            return new PostgresDB();
        }
}
