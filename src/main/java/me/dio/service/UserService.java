package me.dio.service;

import java.util.List;

import me.dio.domain.model.User;
import me.dio.domain.model.dto.UserDTO;

public interface UserService {
	User findById(Long id);
	List<User> FindAll();
	User create(User userToCreate);
	void delete(Long id);
	User update(Long id, UserDTO userChanges);

	
}
