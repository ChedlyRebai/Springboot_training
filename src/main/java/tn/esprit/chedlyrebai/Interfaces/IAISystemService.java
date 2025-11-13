package tn.esprit.chedlyrebai.Interfaces;

import java.util.List;

import tn.esprit.chedlyrebai.domain.AISystems;

public interface IAISystemService {
    List<AISystems> getAllAISystems();
    AISystems getAISystemById(Long id);
    void createAISystem(AISystems createdAISystem);
    void updateAISystem(Long id, AISystems updatedAISystem);
    void deleteAISystem(Long id);
}
