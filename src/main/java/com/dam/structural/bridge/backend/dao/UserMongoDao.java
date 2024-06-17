package com.dam.structural.bridge.backend.dao;

import com.dam.structural.bridge.backend.model.User;

public class UserMongoDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
