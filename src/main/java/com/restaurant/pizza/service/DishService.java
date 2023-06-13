package com.restaurant.pizza.service;

import com.restaurant.pizza.beans.Dish;
import com.restaurant.pizza.daos.DishDao;

public class DishService {

	private static DishDao dishDao;

	public DishService() {
		dishDao = new DishDao();
	}

	public void persist(Dish entity) {
		dishDao.openCurrentSessionwithTransaction();
		dishDao.persist(entity);
		dishDao.closeCurrentSessionwithTransaction();
	}

	public void update(Dish entity) {
		dishDao.openCurrentSessionwithTransaction();
		dishDao.update(entity);
		dishDao.closeCurrentSessionwithTransaction();
	}

	public Dish findById(int id) {
		dishDao.openCurrentSession();
		Dish book = dishDao.findById(id);
		dishDao.closeCurrentSession();
		return book;
	}
}
