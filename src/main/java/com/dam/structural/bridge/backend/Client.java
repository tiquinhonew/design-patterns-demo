package com.dam.structural.bridge.backend;

import com.dam.structural.bridge.backend.dao.UserMongoDao;
import com.dam.structural.bridge.backend.dao.UserMysqlDao;
import com.dam.structural.bridge.backend.dao.UserOracleDao;
import com.dam.structural.bridge.backend.dao.UserPostgresDao;
import com.dam.structural.bridge.backend.model.User;
import com.dam.structural.bridge.backend.services.UserEJB;
import com.dam.structural.bridge.backend.services.UserRest;
import com.dam.structural.bridge.backend.services.UserService;
import com.dam.structural.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
