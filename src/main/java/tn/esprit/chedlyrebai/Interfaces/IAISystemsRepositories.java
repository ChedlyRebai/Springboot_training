package tn.esprit.chedlyrebai.Interfaces;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.chedlyrebai.domain.AISystems;
public interface IAISystemsRepositories extends CrudRepository<AISystems, Long> {

    void deleteById(Long aiSystemId);
    AISystems save(AISystems aiSystems);
    Optional<AISystems> findById(Long aiSystemId);
   // void updateAISystems(Long aiSystemId, AISystems aiSystems);
}
