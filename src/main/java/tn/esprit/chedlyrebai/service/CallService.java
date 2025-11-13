
package tn.esprit.chedlyrebai.service;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import tn.esprit.chedlyrebai.Interfaces.ICallsService;
import tn.esprit.chedlyrebai.domain.Calls;
import tn.esprit.chedlyrebai.repositories.CallsRepositories;

@Service
@RequiredArgsConstructor
public class CallService implements ICallsService{

    private final CallsRepositories  callRepository;
    @Override
    public void getAllCalls() {
        this.callRepository.findAll();
    }

    @Override
    public void getCallById(Long id) {
        this.callRepository.findById(id).orElse(null);
    }

   

    @Override
    public void deleteCall(Long id) {
        this.callRepository.deleteById(id);
    }

    @Override
    public void createCall(Calls createdCall) {
        this.callRepository.save(createdCall);
    }

    @Override
    public void updateCall(Long id, Calls updatedCall) {
        Calls existingCall= this.callRepository.findById(id).get();
        if(existingCall==null){
            return;
        }else{
            // Update fields of existingCall with values from updatedCall
            existingCall=updatedCall;
        }
        // Update fields of existingCall with values from updatedCall
        this.callRepository.save(existingCall);
    }

}