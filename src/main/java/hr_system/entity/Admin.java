package hr_system.entity;

public class Admin extends user{
	public Admin() {
		super();
	}
	
	public Admin(Integer id, String firstName, String lastName, String email) {
		super(id, firstName, lastName, email);
	}
}
