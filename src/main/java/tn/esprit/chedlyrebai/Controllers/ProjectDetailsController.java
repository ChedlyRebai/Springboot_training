package tn.esprit.chedlyrebai.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.Interfaces.ProjectDetailsRepositories;

@RestController
@RequestMapping("/api/project-details")
public class ProjectDetailsController {

    private final ProjectDetailsRepositories projectDetailsRepositories;

    public ProjectDetailsController(ProjectDetailsRepositories projectDetailsRepositories) {
        this.projectDetailsRepositories = projectDetailsRepositories;
    }
}
