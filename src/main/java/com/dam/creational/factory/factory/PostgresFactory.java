package com.dam.creational.factory.factory;

import com.dam.creational.factory.db.DB;
import com.dam.creational.factory.db.PostgresDB;

public class PostgresFactory implements DBFactory {

        @Override
        public DB getDatabase() {
            return new PostgresDB();
        }
}
