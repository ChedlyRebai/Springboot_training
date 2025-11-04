package tn.esprit.chedlyrebai.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.repositories.AISystemsRepositories;

@RestController
@RequestMapping("/api/aisystems")
public class AISystemsController {

    private final AISystemsRepositories aiSystemsRepositories;

    public AISystemsController(AISystemsRepositories aiSystemsRepositories) {
        this.aiSystemsRepositories = aiSystemsRepositories;
    }
}
