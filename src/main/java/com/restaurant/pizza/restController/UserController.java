package com.restaurant.pizza.restController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.pizza.beans.User;
import com.restaurant.pizza.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PutMapping(path = "/persist", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void persistUser(@RequestBody User user) {
		userService.persist(user);
	}

	@PutMapping(path = "/update", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void updateUser(@RequestBody User user) {
		userService.update(user);
	}

	@DeleteMapping(path = "/delete", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteUser(@RequestBody User user) {
		userService.delete(user);
	}

	@GetMapping(path = "/findAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<User> findAll() {
		return userService.findAll();
	}

	@DeleteMapping(path = "/deleteAll", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteAll() {
		userService.deleteAll();
	}
}
