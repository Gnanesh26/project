package Demo.Project.Controller;

import Demo.Project.Entity.Project;
import Demo.Project.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

     @Autowired
     ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/projects2")
    public Project hai(@RequestParam int id) {
        return projectService.hai(id);
    }

}
