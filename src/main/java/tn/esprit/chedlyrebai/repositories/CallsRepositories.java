package tn.esprit.chedlyrebai.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.chedlyrebai.Interfaces.ICallsRepositories;
import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.Calls;

@Repository
public interface CallsRepositories extends ICallsRepositories, CrudRepository<Calls, Long> {

 
}
