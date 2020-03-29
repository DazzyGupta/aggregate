package user.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import user.entities.User;
import user.services.UserService;

@Service
public class DefaultUserService implements UserService{

	@Resource
	private RestTemplate restTemplate;

	List<User> users = new ArrayList<User>() {{
		add(new User(1, "Dazzy", 22, "dazzygupta@gmail.com"));
		add(new User(2, "Sachin", 24, "sachin@gmail.com"));
		add(new User(3, "Priya", 25, "priya@gmail.com"));
		add(new User(4, "Harjot", 23, "harjot@gmail.com"));
	}};

	public List<User> getAllUsers() {
		return users;
	}

	public User getUserByID(Integer id) {
		Optional<User> resultuser = getAllUsers().stream()
				.filter(p -> id.equals(p.getUserID())).findFirst();
		if (resultuser.isPresent()) {
			return resultuser.get();
		}
		return null;
	}

}
