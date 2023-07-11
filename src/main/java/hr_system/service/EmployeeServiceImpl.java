package hr_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hr_system.entity.AppUser;
import hr_system.entity.Tasks;
import hr_system.repo.IEmployeeRepository;
import hr_system.repo.ITasksRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeRepository employeerepo ;
	private ITasksRepo tasksrepo ;

	public EmployeeServiceImpl(IEmployeeRepository employeerepo, ITasksRepo tasksrepo) {
		super();
		this.employeerepo = employeerepo;
		this.tasksrepo = tasksrepo;
	}	
	

	@Override
	public List<Tasks> getAllTasksNames(Integer user_id) {
		return tasksrepo.findAllTasksNames(user_id);
	}



	@Override
	public List<AppUser> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}



	@Override
	public void addEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Tasks saveTasks(Tasks task) {
		return tasksrepo.save(task);
	}


	@Override
	public List<AppUser> getAdminEmployees(Integer id) {
		return employeerepo.getAdminEmployees(id);
	}

	

}
