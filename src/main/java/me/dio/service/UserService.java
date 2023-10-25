package me.dio.service;

import me.dio.domain.model.User;
import me.dio.domain.model.dto.UserDTO;

public interface UserService {
	User findById(Long id);
	User create(User userToCreate);
	void delete(Long id);
	User update(Long id, UserDTO userChanges);

	
}
