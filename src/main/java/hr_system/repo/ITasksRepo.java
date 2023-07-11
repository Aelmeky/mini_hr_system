package hr_system.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hr_system.entity.Tasks;

public interface ITasksRepo extends JpaRepository<Tasks,Integer>{
	@Query(value = "SELECT * FROM tasks WHERE user_id = ?1", nativeQuery=true)
	List<Tasks> findAllTasksNames(Integer user_id);
	
}
