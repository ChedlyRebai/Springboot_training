package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.domain.Agent;
import tn.esprit.chedlyrebai.repositories.AgentRepositories;
import tn.esprit.chedlyrebai.service.AgentService;

@RestController
@RequestMapping("/api/agent")
public class AgentController {
    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping
    public Iterable<Agent> getAllAgents() {
        return this.agentService.getAllAgent();
    }

    @GetMapping("/{id}")
    public Agent getAgentById(@PathVariable Long id) {
        return this.agentService.getAgentById(id);
    }

    @PostMapping
    public void createAgent(@RequestBody Agent createdAgent) {
        agentService.createAgent(createdAgent);
    }

    @PutMapping("/{id}")
    public void updateAgent(@PathVariable Long id, @RequestBody Agent updatedAgent) {
        agentService.updateAgent(id, updatedAgent);

    }

    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable Long id) {
        agentService.deleteAgent(id);
    }

}
