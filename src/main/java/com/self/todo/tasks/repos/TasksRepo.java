package com.self.todo.tasks.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.self.todo.tasks.model.Task;

/**
 * @author syalama
 *
 */

@Repository
public interface TasksRepo extends CrudRepository<Task, Integer> {
	
	List<Task> findByUser(String user);
    
}
