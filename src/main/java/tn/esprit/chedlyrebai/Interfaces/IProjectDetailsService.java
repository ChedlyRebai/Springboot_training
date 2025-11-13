package tn.esprit.chedlyrebai.Interfaces;

import tn.esprit.chedlyrebai.domain.ProjectDetails;

public interface IProjectDetailsService {
    ProjectDetails getProjectDetailsById(Long id);
    void createProjectDetails(ProjectDetails createdProjectDetails);
    void updateProjectDetails(Long id, ProjectDetails updatedProjectDetails);
    void deleteProjectDetails(Long id);
}
