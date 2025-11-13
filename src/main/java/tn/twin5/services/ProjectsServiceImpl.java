package tn.twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.twin5.entities.Projects;
import tn.twin5.repositories.IProjectdRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectsServiceImpl implements IProjectsServices {

    private IProjectdRepository projectdRepository;

    @Autowired
    public ProjectsServiceImpl(IProjectdRepository projectdRepository) {
        this.projectdRepository = projectdRepository;
    }

    @Override
    public Projects addProject(Projects project) {
        return projectdRepository.save(project);
    }

    @Override
    public Projects updateProject(Projects project) {
        return projectdRepository.save(project);
    }

    @Override
    public void deleteProject(Projects project) {
        projectdRepository.delete(project);
    }

    @Override
    public Projects findById(Long id) {
        return projectdRepository.findById(id).orElse(null);
    }

    @Override
    public List<Projects> findAll() {
        return (List<Projects>) projectdRepository.findAll();
    }
}
