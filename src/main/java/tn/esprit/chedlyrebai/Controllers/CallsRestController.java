package tn.esprit.chedlyrebai.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.chedlyrebai.domain.Calls;
import tn.esprit.chedlyrebai.repositories.CallsRepositories;
import tn.esprit.chedlyrebai.service.CallService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/calls")
public class CallsRestController {
	

    private CallService callsService;

    public CallsRestController(CallService callsService) {
        this.callsService = callsService;
    }

    @GetMapping
    public List<Calls> getAllCalls() {
        return this.callsService.getAllCalls();
    }  
    
    @PostMapping("save")
    public String addCalls(@RequestBody Calls entity) {
        this.callsService.createCall(entity);
        return "Call added successfully";
    }
    
    @DeleteMapping("delete")
    public String deleteCalls(@RequestParam Long id) {
        this.callsService.deleteCall(id);
        return "Call deleted successfully";
    }




    
    
}
