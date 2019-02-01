package com.halilacikgoz.list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller //RestController olarak değiştirince postman'in verdiği hata düzeliyor. ???
public class TaskController {

	@Autowired
	private TaskService taskService;

	@RequestMapping("/tasks")
	public String getAllTasks(Model model) {

		model.addAttribute("tasks", taskService.getAllTasks());
		
		return "allTasks";
	}

	@RequestMapping("/tasks/{id}")
	public String getTask(@PathVariable String id, Model model) {

		model.addAttribute("task", taskService.getTask(id));
		return "getTask";

	}

	@RequestMapping(method = RequestMethod.POST, value = "/tasks")
	public void addTask(@RequestBody Task task) {
		taskService.addTask(task);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/tasks/{id}")
	public void updateTask(@RequestBody Task task) {
		taskService.updateTask(task);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/tasks/{id}")
	public void deleteTtask(@PathVariable String id) {
		taskService.deleteTask(id);

	}

}
