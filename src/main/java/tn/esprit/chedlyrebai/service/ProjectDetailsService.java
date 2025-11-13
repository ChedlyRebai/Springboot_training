package tn.esprit.chedlyrebai.service;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.IProjectDetailsService;
import tn.esprit.chedlyrebai.Interfaces.ProjectDetailsRepositories;
import tn.esprit.chedlyrebai.domain.ProjectDetails;

@Service
@RequiredArgsConstructor
public class ProjectDetailsService implements IProjectDetailsService {

    private final ProjectDetailsRepositories projectDetailsRepositories;

    @Override
    public void createProjectDetails(ProjectDetails createdProjectDetails) {
        this.projectDetailsRepositories.save(createdProjectDetails);
    }

    @Override
    public void updateProjectDetails(Long id, ProjectDetails updatedProjectDetails) {
        ProjectDetails existingProjectDetails = this.projectDetailsRepositories.findById(id).get();
        if (existingProjectDetails == null) {
            return;
        } else {
            // Update fields of existingProjectDetails with values from
            // updatedProjectDetails
            existingProjectDetails = updatedProjectDetails;
        }
        // Update fields of existingProjectDetails with values from
        // updatedProjectDetails
        this.projectDetailsRepositories.save(existingProjectDetails);
    }

    @Override
    public void deleteProjectDetails(Long id) {
        this.projectDetailsRepositories.deleteById(id);
    }

    @Override
    public ProjectDetails getProjectDetailsById(Long id) {
        return this.projectDetailsRepositories.findById(id).orElse(null);
    }

}
