package tn.esprit.chedlyrebai.service;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.IAgentSevice;
import tn.esprit.chedlyrebai.domain.Agent;
import tn.esprit.chedlyrebai.repositories.AgentRepositories;

@Service
@RequiredArgsConstructor
public class AgentService implements IAgentSevice {

    private final AgentRepositories agentRepo;

    @Override
    public Agent createAgent(Agent agent) {
        return this.agentRepo.save(agent);
    }

    @Override
    public Agent updateAgent(Long id, Agent agent) {
        Optional<Agent> existingAgent = this.agentRepo.findById(id);
        if (existingAgent.isPresent()) {
            Agent agentToUpdate = existingAgent.get();
            agentToUpdate.setAvailable(agent.isAvailable());
            agentToUpdate.setCalls(agent.getCalls());
            agentToUpdate.setName(agent.getName());
            agentToUpdate.setSkills(agent.getSkills());
            agentToUpdate.setProjects(agent.getProjects());
            return this.agentRepo.save(agentToUpdate);
        } else {
            throw new IllegalArgumentException("Agent not found with id: " + id);
        }
    }


    
    @Override
    public void deleteAgent(Long id) {
        Optional<Agent> agent = this.agentRepo.findById(id);
        if (agent.isPresent()) {
            this.agentRepo.delete(agent.get());
        }
    }

    @Override
    public List<Agent> getAllAgent() {
        return this.agentRepo.findAll();
    }

    @Override
    public Agent getAgentById(Long id) {
        return this.agentRepo.findById(id).get();
    }

}
