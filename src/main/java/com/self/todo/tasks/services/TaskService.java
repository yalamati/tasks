package com.self.todo.tasks.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.todo.tasks.model.Task;
import com.self.todo.tasks.repos.TasksRepo;

import lombok.RequiredArgsConstructor;

/**
 * @author syalama
 *
 */

@Service
@RequiredArgsConstructor
public class TaskService {

	@Autowired
	private TasksRepo tasksRepo;

	public List<Task> getTasks(String user) {
		return tasksRepo.findByUser(user);
	}
	
	public List<Task> getAllTasks() {
	    List<Task> alltasks = new ArrayList<Task>();
	    (tasksRepo.findAll()).forEach(alltasks::add);
	    return alltasks;
	}
	
	
	public Optional<Task> getTask(Integer id) {
		return tasksRepo.findById(id);
	}

	public void createTask(Task task) {
		tasksRepo.save(task);
	}

	public void updateTask(Task task) {
		tasksRepo.save(task);
	}

	public void deleteTask(Integer id) {
		tasksRepo.deleteById(id);
	}

}
