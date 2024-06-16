package com.dam.creational.singleton.connectionpool.connection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final ConnectionPool singleton = new ConnectionPool();
    public static final int POOL_SIZE = 2;
    private final List<Connection> connectionsPool;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for(int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection available = null;
        for(Connection conn: connectionsPool) {
            if(!conn.isInUse()) {
                available = conn;
                break;
            }
        }
        if(available == null) {
            System.out.println("No Connections available");
            return null;
        }
        available.setInUse(true);
        return available;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}
