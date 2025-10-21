package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.domain.Calls;
import tn.esprit.chedlyrebai.repositories.CallsRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/calls")
public class CallsRestController {
	

    private CallsRepositories callsRepositories;

    public CallsRestController(CallsRepositories callsRepositories) {
        this.callsRepositories = callsRepositories;
    }

    @GetMapping
    public Iterable<Calls> getAllCalls() {
        return this.callsRepositories.findAll();
    }  
    
    @PostMapping("save")
    public String addCalls(@RequestBody Calls entity) {
        this.callsRepositories.save(entity);
        return "Call added successfully";
    }

    @DeleteMapping("/delete")
    public String deleteCalls(@RequestParam Long callId) {
        this.callsRepositories.deleteById(callId);
        return "Call deleted successfully";
    
    }
    
    
}
