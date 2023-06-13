package com.restaurant.pizza.daos;

import java.util.List;

import javax.transaction.Transactional;

import com.restaurant.pizza.beans.Client;

@Transactional
public class ClientDao extends BaseDao implements BaseDaoInterface<Client, Integer> {

	public ClientDao() {
		super();
	}

	public Client findByFirstName(String name) {
		return (Client) getCurrentSession().createQuery("from Client where FirstName =:name").setParameter("name", name)
				.uniqueResult();
	}

	public Client findByEmail(String email) {

		return (Client) getCurrentSession().createQuery("from Client where Email =:mail").setParameter("mail", email)
				.uniqueResult();
	}

	@Override
	public void persist(Client entity) {
		getCurrentSession().persist(entity);

	}

	@Override
	public void save(Client entity) {
		getCurrentSession().save(entity);

	}

	@Override
	public void update(Client entity) {
		getCurrentSession().update(entity);

	}

	@Override
	public Client findById(Integer id) {
		return getCurrentSession().get(Client.class, id);
	}

	@Override
	public void delete(Client entity) {
		getCurrentSession().delete(entity);

	}

	@Override
	public List<Client> findAll() {
		List<Client> client = (List<Client>) getCurrentSession().createQuery("from Client").list();
		return client;
	}

	@Override
	public void deleteAll() {
		List<Client> entityList = findAll();
		for (Client entity : entityList) {
			delete(entity);
		}

	}

}
