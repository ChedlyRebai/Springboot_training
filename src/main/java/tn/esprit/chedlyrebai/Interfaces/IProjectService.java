package tn.esprit.chedlyrebai.Interfaces;

import tn.esprit.chedlyrebai.domain.Projects;

public interface IProjectService {
    void getAllProjects();
    void getProjectById(Long id);
    void createProject(Projects createdProject);
    void updateProject(Long id, Projects updatedProject);
    void deleteProject(Long id);
}
