package tn.esprit.chedlyrebai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.IAISystemService;
import tn.esprit.chedlyrebai.domain.AISystems;
import tn.esprit.chedlyrebai.repositories.AISystemsRepositories;

@Service
@RequiredArgsConstructor
public class AISystemService implements IAISystemService {

    private final AISystemsRepositories aiSystemsRepositories;

    @Override
    public void deleteAISystem(Long id) {
        this.aiSystemsRepositories.deleteById(id);

    }

    @Override
    public List<AISystems> getAllAISystems() {
        return (List<AISystems>) this.aiSystemsRepositories.findAll();
    }

    @Override
    public AISystems getAISystemById(Long id) {
        return this.aiSystemsRepositories.findById(id).orElse(null);
    }

    @Override
    public void createAISystem(AISystems createdAISystem) {

        this.aiSystemsRepositories.save(createdAISystem);
    }

    @Override
    public void updateAISystem(Long id, AISystems updatedAISystem) {
        this.aiSystemsRepositories.updateAISystems(id, updatedAISystem);
    }

}
