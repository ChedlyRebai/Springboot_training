package tn.esprit.chedlyrebai.Interfaces;

import tn.esprit.chedlyrebai.domain.Calls;

public interface ICallsService {
    void getAllCalls();
    void getCallById(Long id);
    void createCall(Calls createdCall);
    void updateCall(Long id, Calls updatedCall);
    void deleteCall(Long id);
}
