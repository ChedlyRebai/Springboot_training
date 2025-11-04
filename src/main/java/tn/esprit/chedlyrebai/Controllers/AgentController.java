package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.repositories.AgentRepositories;

@RestController
@RequestMapping("/api/agent")
public class AgentController {
    private final AgentRepositories agentRepositories;

    public AgentController(AgentRepositories agentRepositories) {
        this.agentRepositories = agentRepositories;
    }

    
}
