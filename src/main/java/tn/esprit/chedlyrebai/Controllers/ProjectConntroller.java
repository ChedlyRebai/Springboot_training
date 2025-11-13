package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.repositories.ProjectRepositories;

@RestController
@RequestMapping("/api/projects")
public class ProjectConntroller {

    private final ProjectRepositories projectRepositories;

    public ProjectConntroller(ProjectRepositories projectRepositories) {
        this.projectRepositories = projectRepositories;
    }

    
}
