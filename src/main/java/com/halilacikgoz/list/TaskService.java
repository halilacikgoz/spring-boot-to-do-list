package com.halilacikgoz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

//	List<Task> tasks = new ArrayList<>(
//			Arrays.asList(new Task("spring", "spring framework", "Spring Framework Description"),
//					new Task("java", "java framework", "Core Java Description"),
//					new Task("javascript", "javascript framework", "JavaScript Description")
//
//			));

	public List<Task> getAllTasks() {

		// return tasks;

		return (List<Task>) taskRepository.findAll();
	}

	public Task getTask(String id) {

		// return tasks.stream().filter(t -> t.getId().equals(id)).findFirst().get();

		return taskRepository.findById(id).get();
	}

	public void addTask(Task task) {

		taskRepository.save(task);

	}

	public void updateTask(Task task) {
		
		taskRepository.save(task);

	}

	public void deleteTask(String id) {
		taskRepository.deleteById(id);

	}

}
