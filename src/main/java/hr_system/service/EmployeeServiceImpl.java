package hr_system.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hr_system.entity.Employee;
import hr_system.repo.IEmployeeRepository;
import jakarta.persistence.Id;

@Service
public class EmployeeServiceImpl implements IEmployeeService, UserDetailsService {
	
	private IEmployeeRepository employeerepo ;

	public EmployeeServiceImpl(IEmployeeRepository employeerepo) {
		super();
		this.employeerepo = employeerepo;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeerepo.findAll();
	}

	@Override
	public Employee saveEmplyee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void requestLeave(LocalTime time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return employeerepo.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format("user not found try again")));
	}

	

}
