
package tn.esprit.chedlyrebai.service;


import org.aspectj.weaver.ast.Call;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.esprit.chedlyrebai.Interfaces.ICallsService;

@Service
@RequiredArgsConstructor
public class CallService implements ICallsService{

    @Override
    public void getAllCalls() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCalls'");
    }

    @Override
    public void getCallById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCallById'");
    }

    @Override
    public void createCall(Call createdCall) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCall'");
    }

    @Override
    public void updateCall(Long id, Call updatedCall) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCall'");
    }

    @Override
    public void deleteCall(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCall'");
    }

}