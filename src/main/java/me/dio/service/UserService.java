package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
	User findbyId(Long id);
	User create(User userToCreate);
	void delete(Long id);
	
}
