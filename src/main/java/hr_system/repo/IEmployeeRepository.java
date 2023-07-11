package hr_system.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hr_system.entity.AppUser;
import hr_system.entity.Tasks;

@Repository
@Transactional
public interface IEmployeeRepository extends JpaRepository<AppUser,Integer>{
	Optional<AppUser> findByEmail(String email);
}
