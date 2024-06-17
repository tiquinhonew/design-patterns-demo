package com.dam.structural.bridge.backend.services;

import com.dam.structural.bridge.backend.dao.UserDao;
import com.dam.structural.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
