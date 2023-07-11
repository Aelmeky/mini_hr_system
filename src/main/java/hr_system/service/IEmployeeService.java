package hr_system.service;

import java.time.LocalTime;
import java.util.List;

import hr_system.entity.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmployees();
	Employee saveEmplyee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee getEmployeeById(Integer id);
	void deleteEmployeeById(Integer id);
	void requestLeave(LocalTime time);
}
