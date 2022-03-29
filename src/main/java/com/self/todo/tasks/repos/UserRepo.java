package com.self.todo.tasks.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.self.todo.tasks.model.User;

/**
 * @author syalama
 *
 */

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
	
}
