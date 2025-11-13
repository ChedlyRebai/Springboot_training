package tn.esprit.chedlyrebai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.IProjectService;
import tn.esprit.chedlyrebai.domain.Projects;
import tn.esprit.chedlyrebai.repositories.ProjectRepositories;

@Service
@RequiredArgsConstructor
public class ProjectService  implements IProjectService {

    private final ProjectRepositories projectRepositories;
    @Override
    public List<Projects> getAllProjects() {
        return this.projectRepositories.findAll();
    }

    @Override
    public Projects getProjectById(Long id) {
        return this.projectRepositories.findById(id).orElse(null);
    }


    @Override
    public void deleteProject(Long id) {
        this.projectRepositories.deleteById(id);
    }

    @Override
    public void createProject(Projects createdProject) {
        this.projectRepositories.save(createdProject);
    }

    @Override
    public void updateProject(Long id, Projects updatedProject) {
       
        Projects existingProject= this.projectRepositories.findById(id).get();
        if (existingProject == null) {
            return;
        } else {
            // Update fields of existingProject with values from updatedProject
            existingProject = updatedProject;
        }
        // Update fields of existingProject with values from updatedProject
        this.projectRepositories.save(existingProject);
    }
    
}
