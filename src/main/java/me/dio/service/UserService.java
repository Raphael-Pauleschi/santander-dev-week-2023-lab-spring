package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
	User findbyId(Long id);
	User create(User user);
	
}
