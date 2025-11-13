package tn.esprit.chedlyrebai.Interfaces;

import org.aspectj.weaver.ast.Call;

public interface ICallsService {
    void getAllCalls();
    void getCallById(Long id);
    void createCall(Call createdCall);
    void updateCall(Long id, Call updatedCall);
    void deleteCall(Long id);
}
