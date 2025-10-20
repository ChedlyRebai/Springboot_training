package tn.esprit.chedlyrebai.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.chedlyrebai.Interfaces.IAgentRepositories;
import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.domain.Agent;

public class AgentRepositories implements IAgentRepositories {

    private final CrudRepository<Agent, Long> crudRepository;

    public AgentRepositories(CrudRepository<Agent, Long> crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public void deleteById(Long agentId) {
        crudRepository.deleteById(agentId);
        // Additional logic can be added here if needed
    }
    @Override
    public Agent save(Agent agent) {
        return crudRepository.save(agent);
    }
    @Override
    public Optional<Agent> findById(Long agentId) {
        return crudRepository.findById(agentId);
    }
    @Override
    public void updateAgent(Long agentId, Agent agent) {
        if (crudRepository.existsById(agentId)) {
            crudRepository.save(agent);
        } else {
            throw new IllegalArgumentException("Agent with ID " + agentId + " does not exist.");
        }
    }

    @Override
    public <S extends Agent> Iterable<S> saveAll(Iterable<S> entities) {
        return crudRepository.saveAll(entities);
    }
    @Override
    public boolean existsById(Long id) {
        return crudRepository.existsById(id);
    }
    @Override
    public Iterable<Agent> findAll() {
        return crudRepository.findAll();
    }

    @Override
    




}
