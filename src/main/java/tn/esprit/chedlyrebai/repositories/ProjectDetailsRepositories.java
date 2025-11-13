package tn.esprit.chedlyrebai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.chedlyrebai.domain.ProjectDetails;

public interface ProjectDetailsRepositories extends JpaRepository<ProjectDetails,Long>  {
    
}
