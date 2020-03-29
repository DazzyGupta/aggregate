package user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.entities.User;
import user.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	UserService userService;
	
	@GetMapping
	List<User> getUserDetails() {
		return userService.getAllUsers();
	}
	
	@GetMapping(value = "/{id}")
	public User getUserDetailsById(@PathVariable(name = "id") Integer id) {
		return userService.getUserByID(id);
	}
}
