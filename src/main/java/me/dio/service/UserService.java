package me.dio.service;

import me.dio.domain.model.User;
import me.dio.domain.model.dto.UserDTO;

public interface UserService {
	User findbyId(Long id);
	User create(UserDTO userToCreate);
	
}
