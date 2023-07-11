package hr_system.service;

import java.util.List;

import hr_system.entity.AppUser;
import hr_system.entity.Tasks;

public interface IEmployeeService {
	List<AppUser> getAllEmployees();
	void addEmployeeById(Integer id);
	List<Tasks> getAllTasksNames(Integer id);
}
