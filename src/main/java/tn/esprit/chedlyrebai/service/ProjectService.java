package tn.esprit.chedlyrebai.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.IProjectService;
import tn.esprit.chedlyrebai.domain.Projects;

@Service
@RequiredArgsConstructor
public class ProjectService  implements IProjectService {

    @Override
    public void getAllProjects() {
        // Implementation here
    }

    @Override
    public void getProjectById(Long id) {
        // Implementation here
    }


    @Override
    public void deleteProject(Long id) {
        // Implementation here
    }

    @Override
    public void createProject(Projects createdProject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProject'");
    }

    @Override
    public void updateProject(Long id, Projects updatedProject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProject'");
    }
    
}
