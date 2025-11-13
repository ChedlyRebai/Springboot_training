package tn.esprit.chedlyrebai.Interfaces;

import java.util.List;

import tn.esprit.chedlyrebai.domain.Agent;

public interface IAgentSevice {
    Agent createAgent(Agent agent);
    Agent updateAgent(Long id,Agent agent);
    void deleteAgent(Long id);
    List<Agent> getAllAgent();
    
}
