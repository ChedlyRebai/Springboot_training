package tn.esprit.chedlyrebai.Interfaces;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.ProjectDetails;
import tn.esprit.chedlyrebai.domain.Projects;

public interface ProjectDetailsRepositories extends JpaRepository<ProjectDetails, Long> {
    void deleteById(Long projectId);
    ProjectDetails save(ProjectDetails projectDetails);
    Optional<ProjectDetails> findById(Long projectId);
  //  void  updateProjectDetails(Long projectId, ProjectDetails projectDetails);
}
