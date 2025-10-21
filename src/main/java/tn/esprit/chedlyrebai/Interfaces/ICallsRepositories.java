package tn.esprit.chedlyrebai.Interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.Calls;

public interface ICallsRepositories extends CrudRepository<Calls, Long> {

    void deleteById(Long callId);
    Calls save(Calls calls);
    Optional<Calls> findById(Long callId);
    //void updateCalls(Long callId, Calls calls);
}
