package vn.iotstar.repository;

import vn.iotstar.entity.User;
import vn.iotstar.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> allUsers() {
		List<User> users = new ArrayList<>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}

}
