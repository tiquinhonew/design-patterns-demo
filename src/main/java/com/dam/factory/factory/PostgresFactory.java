package com.dam.factory.factory;

import com.dam.factory.db.DB;
import com.dam.factory.db.PostgresDB;

public class PostgresFactory implements DBFactory {

        @Override
        public DB getDatabase() {
            return new PostgresDB();
        }
}
