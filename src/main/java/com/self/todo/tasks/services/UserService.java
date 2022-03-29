package com.self.todo.tasks.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.todo.tasks.model.User;
import com.self.todo.tasks.repos.UserRepo;

import lombok.RequiredArgsConstructor;

/**
 * @author syalama
 *
 */

@Service
@RequiredArgsConstructor
public class UserService {

	@Autowired
	private UserRepo usersRepo;

	public void saveUser(User user) {
		usersRepo.save(user);
	}

	public void deleteUser(Integer id) {
		usersRepo.deleteById(id);
	}

	public Optional<User> getUser(Integer id) {
		return usersRepo.findById(id);
	}
}
