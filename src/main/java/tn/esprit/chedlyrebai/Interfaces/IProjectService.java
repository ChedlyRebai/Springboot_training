package tn.esprit.chedlyrebai.Interfaces;

import java.util.List;

import tn.esprit.chedlyrebai.domain.Projects;

public interface IProjectService {
    List<Projects> getAllProjects();
    Projects getProjectById(Long id);
    void createProject(Projects createdProject);
    void updateProject(Long id, Projects updatedProject);
    void deleteProject(Long id);
}
