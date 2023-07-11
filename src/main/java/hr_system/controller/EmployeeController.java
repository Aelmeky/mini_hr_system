package hr_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hr_system.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	private IEmployeeService employeeService;

	public EmployeeController(IEmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/employees/tasks/{id}")
	public String listTasks(@PathVariable Integer id, Model model) {
		model.addAttribute("tasks", employeeService.getAllTasksNames(id));
		return "employee";
	}

	
	
	
}
