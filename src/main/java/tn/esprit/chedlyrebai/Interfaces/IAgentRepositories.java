package tn.esprit.chedlyrebai.Interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.Agent;

public interface IAgentRepositories extends JpaRepository<Agent, Long> {

    void deleteById(Long agentId);
    Agent save(Agent agent);
    Optional<Agent> findById(Long agentId);
    void updateAgent(Long agentId, Agent agent);
}
