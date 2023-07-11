package hr_system.entity;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class AppUser implements UserDetails{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
	private Integer id;
	private String name;
	private String username;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private AppUserRole appUserRole;
	private boolean locked;
	private boolean enabled;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(appUserRole.name());
		return Collections.singletonList(authority);
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return !locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appUserRole, email, enabled, id, locked, name, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppUser other = (AppUser) obj;
		return appUserRole == other.appUserRole && Objects.equals(email, other.email) && enabled == other.enabled
				&& Objects.equals(id, other.id) && locked == other.locked && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

	public AppUser() {
		
	}
	
	public AppUser(String name, String username, String email, String password, AppUserRole appUserRole, boolean locked,
			boolean enabled) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.appUserRole = appUserRole;
		this.locked = locked;
		this.enabled = enabled;
	}
	
	

}
