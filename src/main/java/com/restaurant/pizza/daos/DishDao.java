package com.restaurant.pizza.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.restaurant.pizza.beans.Dish;

public class DishDao implements DishDaoInterface<Dish, Integer> {
	private Session currentSession;
	private Transaction currentTransaction;

	public DishDao() {
		super();
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();

		configuration.configure().buildSessionFactory();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	@Override
	public void persist(Dish entity) {
		// TODO Auto-generated method stub
		getCurrentSession().save(entity);
	}

	@Override
	public void update(Dish entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);

	}

	@Override
	public Dish findById(Integer id) {
		// TODO Auto-generated method stub
		return getCurrentSession().get(Dish.class, id);

	}

	@Override
	public void delete(Dish entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> findAll() {
		// TODO Auto-generated method stub

		List<Dish> dish = (List<Dish>) getCurrentSession().createQuery("from Client").list();
		return dish;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<Dish> entityList = findAll();
		for (Dish entity : entityList) {
			delete(entity);
		}
	}

	@Override
	public void save(Dish entity) {
		// TODO Auto-generated method stub
		getCurrentSession().save(entity);

	}

}
