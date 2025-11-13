package tn.esprit.chedlyrebai.Interfaces;

import java.util.List;

import tn.esprit.chedlyrebai.domain.Calls;

public interface ICallsService {
    List<Calls> getAllCalls();
    Calls getCallById(Long id);
    void createCall(Calls createdCall);
    void updateCall(Long id, Calls updatedCall);
    void deleteCall(Long id);
}
