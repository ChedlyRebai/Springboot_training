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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProjectDetails'");
    }

    @Override
    public void updateProjectDetails(Long id, ProjectDetails updatedProjectDetails) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProjectDetails'");
    }

    @Override
    public void deleteProjectDetails(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProjectDetails'");
    }

    @Override
    public ProjectDetails getProjectDetailsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectDetailsById'");
    }
    
}
