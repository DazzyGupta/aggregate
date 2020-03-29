package user.services;

import java.util.List;

import user.entities.User;


public interface UserService {
	List<User> getAllUsers();

	User getUserByID(Integer id);
}
