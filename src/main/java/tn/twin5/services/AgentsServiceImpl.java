package tn.twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tn.twin5.entities.Agents;
import tn.twin5.entities.Projects;

import java.util.List;
import tn.twin5.repositories.IAgentsRepository;

@Service
//@RequiredArgsConstructor
public class AgentsServiceImpl implements IAgentsServices {

    private IAgentsRepository agentsRepository;

    @Autowired
    public AgentsServiceImpl(IAgentsRepository agentsRepository) {
        this.agentsRepository = agentsRepository;
    }


    @Override
    public Agents addAgents(Agents agents) {
        agents.setAvailable(true);
        return agentsRepository.save(agents);
    }

    @Override
    public Agents updateAgents(Agents Agents) {
        return agentsRepository.save(Agents);
    }

    @Override
    public void deleteAgents(Agents Agents) {
        agentsRepository.delete(Agents);
    }

    @Override
    public Agents findById(Long id) {
        return agentsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agents> findAll() {
        return (List<Agents>) agentsRepository.findAll();
    }

    
}
