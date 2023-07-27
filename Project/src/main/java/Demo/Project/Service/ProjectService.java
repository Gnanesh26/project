package Demo.Project.Service;
import Demo.Project.Entity.Project;
import Demo.Project.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
     ProjectRepository projectRepository;
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project hai(int id) {
        return projectRepository.getProjectById(id);
    }

}

