package tn.esprit.chedlyrebai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.IAgentSevice;
import tn.esprit.chedlyrebai.domain.Agent;
import tn.esprit.chedlyrebai.repositories.AgentRepositories;


@Service
@RequiredArgsConstructor
public class AgentService  implements IAgentSevice {

    private final AgentRepositories agentRepo;
    @Override
    public Agent createAgent(Agent agent) {
        return this.agentRepo.save(agent);
    }

    @Override
    public Agent updateAgent(Long id, Agent agent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAgent'");
    }

    @Override
    public void deleteAgent(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAgent'");
    }

    @Override
    public List<Agent> getAllAgent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAgent'");
    }
    
}
