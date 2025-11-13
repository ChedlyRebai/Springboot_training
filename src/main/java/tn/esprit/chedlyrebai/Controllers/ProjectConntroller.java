package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.domain.Projects;
import tn.esprit.chedlyrebai.repositories.ProjectRepositories;
import tn.esprit.chedlyrebai.service.ProjectService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/projects")
public class ProjectConntroller {

    private final ProjectService projectService;

    public ProjectConntroller(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping()
    public List<Projects> getAllProjects() {
        return this.projectService.getAllProjects();
    }
    @PostMapping("save")
    public String addProject(@RequestBody Projects entity) {
        this.projectService.createProject(entity);
        return "Project added successfully";
    }
    @PutMapping("update")
    public String updateProject(@RequestParam Long id, @RequestBody Projects entity) {
        this.projectService.updateProject(id, entity);
        return "Project updated successfully";
    }

    @DeleteMapping("delete")
    public String deleteProject(@RequestParam Long id) {
        this.projectService.deleteProject(id);
        return "Project deleted successfully";
    }
    

}
