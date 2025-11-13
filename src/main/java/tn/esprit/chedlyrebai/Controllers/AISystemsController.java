package tn.esprit.chedlyrebai.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.repositories.AISystemsRepositories;
import tn.esprit.chedlyrebai.service.AIsystemService;

@RestController
@RequestMapping("/api/aisystems")
public class AISystemsController {

    private final AIsystemService aiSystemsService;

    public AISystemsController(AIsystemService aiSystemsService) {
        this.aiSystemsService = aiSystemsService;
    }

    @GetMapping
    public List<AISystems> getAllAISystems() {
        return aiSystemsService.getAllAISystems();
    }

    @GetMapping("/{id}")
    public AISystems getAISystemById(@PathVariable Long id) {
        return aiSystemsService.getAISystemById(id);
    }

    @PostMapping
    public void createAISystem(@RequestBody AISystems createdAISystem) {
        aiSystemsService.createAISystem(createdAISystem);
    }

    @PutMapping("/{id}")
    public void updateAISystem(@PathVariable Long id, @RequestBody AISystems updatedAISystem) {
        aiSystemsService.updateAISystem(id, updatedAISystem);
    }

    @DeleteMapping("/{id}")
    public void deleteAISystem(@PathVariable Long id) {
        aiSystemsService.deleteAISystem(id);
    }





}
