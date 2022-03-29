package com.self.todo.tasks.controller;

import static com.self.todo.tasks.util.RestAPIConstants.TASKS_URL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.todo.tasks.model.Task;
import com.self.todo.tasks.services.TaskService;

import lombok.RequiredArgsConstructor;

/**
 * @author syalama
 *
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(TASKS_URL)
@CrossOrigin(origins = "*")
public class TasksController {

	@Autowired
	private TaskService taskSvc;

    @GetMapping("/{username}")
    public List<Task> getUserTasks(@PathVariable String username) {
        return taskSvc.getTasks(username);
    }
    
    @GetMapping("/all")
    public List<Task> getAllTasks() {
        return taskSvc.getAllTasks();
    }
    
    @PostMapping("/addtask")
    public String createTask(@RequestBody Task task) {
        taskSvc.createTask(task);
        return "Task Added";
    }
    
    @DeleteMapping("/{id}")
    public List<Task> deleteTask(@PathVariable Integer id) {
    	taskSvc.deleteTask(id);
    	return taskSvc.getAllTasks();
    }
    
    @PutMapping("/{id}")
    public List<Task> updateTask(@PathVariable Integer id, @RequestBody Task task) {
    	task.setId(id);
    	taskSvc.updateTask(task);
    	return taskSvc.getAllTasks();	
    }    

}