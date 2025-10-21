package tn.esprit.chedlyrebai.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.chedlyrebai.Interfaces.IAISystemsRepositories;
import tn.esprit.chedlyrebai.domain.AISystems;

@Repository
public interface AISystemsRepositories extends IAISystemsRepositories, CrudRepository<AISystems, Long> {

}
