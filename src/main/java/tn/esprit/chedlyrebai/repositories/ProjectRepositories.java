package tn.esprit.chedlyrebai.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.chedlyrebai.Interfaces.IProjectRepositories;
import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.ProjectDetails;


@Repository
public interface ProjectRepositories extends IProjectRepositories, CrudRepository<ProjectDetails, Long> {

}
