package hr_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hr_system.entity.RegistrationRequest;
import hr_system.service.IEmployeeService;
import hr_system.service.RegistartionService;

@Controller
public class EmployeeController {
	
	private IEmployeeService employeeService;
	private RegistartionService registartionService;

	public EmployeeController(IEmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("")
	public String viewHomePage() {
		return "students";
	}
	
	@GetMapping("api/v1/registation")
	public String registation(@RequestBody RegistrationRequest request) {
		return registartionService.register(request);
	}
}
