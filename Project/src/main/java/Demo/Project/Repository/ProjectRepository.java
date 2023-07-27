package Demo.Project.Repository;

import Demo.Project.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    // Additional custom methods can be defined here
    Project getProjectById(int id);
}

