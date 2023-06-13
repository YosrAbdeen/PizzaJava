package com.restaurant.pizza.daos;

import java.util.List;

import com.restaurant.pizza.beans.User;

public class UserDao extends BaseDao implements BaseDaoInterface<User, Integer> {

	public UserDao() {
		super();
	}

	@Override
	public void persist(User entity) {
		getCurrentSession().save(entity);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List findAll() {
		List<User> user = (List<User>) getCurrentSession().createQuery("from User").list();
		return user;
	}

	@Override
	public void deleteAll() {
		@SuppressWarnings("unchecked")
		List<User> entityList = findAll();
		for (User entity : entityList) {
			delete(entity);
		}

	}

	@Override
	public void save(User entity) {
		getCurrentSession().save(entity);
	}

	@Override
	public void update(User entity) {
		getCurrentSession().update(entity);

	}

	@Override
	public void delete(User entity) {
		getCurrentSession().delete(entity);

	}

	@Override
	public User findById(Integer id) {
		return getCurrentSession().get(User.class, id);

	}

}
