package tn.esprit.chedlyrebai.Interfaces;

public interface IAISystemService {
    void getAllAISystems();
    void getAISystemById(Long id);
    void createAISystem(Object createdAISystem);
    void updateAISystem(Long id, Object updatedAISystem);
    void deleteAISystem(Long id);
}
