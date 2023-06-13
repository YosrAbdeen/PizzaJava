package com.restaurant.pizza.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.restaurant.pizza.beans.Client;
import com.restaurant.pizza.daos.ClientDao;

@Service

public class ClientService {

	private static ClientDao clientDao;

	public ClientService() {
		clientDao = new ClientDao();
	}

	public void persist(Client entity) {
		clientDao.openCurrentSessionwithTransaction();
		clientDao.persist(entity);
		clientDao.closeCurrentSessionwithTransaction();
	}

	public void update(Client entity) {
		clientDao.openCurrentSessionwithTransaction();
		clientDao.update(entity);
		clientDao.closeCurrentSessionwithTransaction();
	}

	public Client findById(int id) {
		clientDao.openCurrentSession();
		Client client = clientDao.findById(id);
		clientDao.closeCurrentSession();
		return client;
	}

	public List<Client> findAll() {
		clientDao.openCurrentSession();
		List<Client> clientList = clientDao.findAll();
		clientDao.closeCurrentSession();
		return clientList;
	}

	public Client findByFirstName(String name) {
		clientDao.openCurrentSession();
		Client client = clientDao.findByFirstName(name);
		clientDao.closeCurrentSession();
		return client;
	}

	public Client findByEmail(String email) {
		clientDao.openCurrentSession();
		Client client = clientDao.findByEmail(email);
		clientDao.closeCurrentSession();
		return client;
	}

	public void delete(Client client) {
		clientDao.openCurrentSession();
		clientDao.delete(client);
		clientDao.closeCurrentSession();
	}

}
