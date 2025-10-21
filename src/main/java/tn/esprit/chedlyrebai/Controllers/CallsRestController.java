package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.domain.Calls;
import tn.esprit.chedlyrebai.repositories.CallsRepositories;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    
}
