package hr_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends user{
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "salary")
	private int salary;
	
	public Employee() {
		super();
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(Integer id, String firstName, String lastName, String email, String mobile, String position, int salary) {
		super(id, firstName, lastName, email);
		this.mobile = mobile;
		this.position = position;
		this.salary = salary;
	} 

}
