package com.restaurant.pizza.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.restaurant.pizza.beans.User;
import com.restaurant.pizza.daos.UserDao;

@Service
public class UserService {
	private static UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	public void persist(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.persist(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public void save(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.save(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public void update(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.update(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public void delete(User user) {
		userDao.openCurrentSession();
		userDao.delete(user);
		userDao.closeCurrentSession();
	}

	public List<User> findAll() {
		userDao.openCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> userList = userDao.findAll();
		userDao.closeCurrentSession();
		return userList;
	}

	public User findById(int id) {
		userDao.openCurrentSession();
		User user = userDao.findById(id);
		userDao.closeCurrentSession();
		return user;
	}

	public void deleteAll() {
		userDao.openCurrentSession();
		userDao.deleteAll();
		userDao.closeCurrentSessionwithTransaction();
	}
}
