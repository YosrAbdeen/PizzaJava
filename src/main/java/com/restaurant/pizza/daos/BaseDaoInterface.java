package com.restaurant.pizza.daos;

import java.io.Serializable;

import java.util.List;

import com.restaurant.pizza.beans.BaseBean;

public interface BaseDaoInterface<T extends BaseBean, Id extends Serializable> {

	public void persist(T entity);

	public void save(T entity);

	public void update(T entity);

	public T findById(Integer id);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();

}
