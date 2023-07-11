package hr_system.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hr_system.entity.AppUser;
import hr_system.entity.Tasks;
import hr_system.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	private IEmployeeService employeeService;

	public EmployeeController(IEmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees/tasks/{id}")
	public List<Tasks> listTasks(@PathVariable Integer id) {
		return employeeService.getAllTasksNames(id);
	}
	
	@PostMapping("/employees/tasks/{id}")
	public List<Tasks> saveTasks(@RequestBody Tasks task,@PathVariable Integer id) {
		employeeService.saveTasks(task);
		return employeeService.getAllTasksNames(id);
	}
	
	
	@GetMapping("/admin/view/{id}")
	public List<AppUser> getAdminEmployees(@PathVariable Integer id) {
		return employeeService.getAdminEmployees(id);
	}
	
	
	
	

	
	
	
}
