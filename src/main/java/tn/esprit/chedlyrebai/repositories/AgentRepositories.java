package tn.esprit.chedlyrebai.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.chedlyrebai.Interfaces.IAgentRepositories;
import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.Agent;


@Repository
public interface AgentRepositories extends IAgentRepositories, CrudRepository<Agent, Long> {
    
}
