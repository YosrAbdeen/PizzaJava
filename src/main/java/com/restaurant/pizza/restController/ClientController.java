package com.restaurant.pizza.restController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.pizza.beans.Client;
import com.restaurant.pizza.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

	private ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Client getClient(@PathVariable int id) {
		return clientService.findById(id);
	}

	@GetMapping(path = "/byName/{name}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Client getClientByName(@PathVariable String name) {
		return clientService.findByFirstName(name);
	}

	@GetMapping(path = "/byEmail", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Client getClientByEmail(@RequestBody String email) {
		return clientService.findByEmail(email);
	}

	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Client> getClient() {
		return clientService.findAll();
	}

	@PutMapping(path = "/update", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void updateClient(@RequestBody Client client) {
		clientService.update(client);
	}

	@PutMapping(path = "/delete", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteClient(@RequestBody Client client) {
		clientService.delete(client);
	}

	@PutMapping(path = "/create", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void createClient(@RequestBody Client client) {
		clientService.persist(client);
	}

}
