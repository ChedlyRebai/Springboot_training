package tn.esprit.chedlyrebai.domain;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Calls {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long callId;

    private LocalDateTime callsDateTime;
    private String phoneNumber;

    @ElementCollection(targetClass = Skills.class)
    @Enumerated(EnumType.STRING)
    private Set<Skills> requiredSkills;

    @Enumerated(EnumType.STRING)
    private CallStatus status;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent assignedAgent;

    @ManyToOne
    @JoinColumn(name = "ai_system_id")
    private AISystems assignedAISystem;

    public Long getCallId() {
        return callId;
    }

    public void setCallId(Long callId) {
        this.callId = callId;
    }

    public LocalDateTime getCallsDateTime() {
        return callsDateTime;
    }

    public void setCallsDateTime(LocalDateTime callsDateTime) {
        this.callsDateTime = callsDateTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Skills> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(Set<Skills> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public CallStatus getStatus() {
        return status;
    }

    public void setStatus(CallStatus status) {
        this.status = status;
    }

    public Agent getAssignedAgent() {
        return assignedAgent;
    }

    public void setAssignedAgent(Agent assignedAgent) {
        this.assignedAgent = assignedAgent;
    }

    public AISystems getAssignedAISystem() {
        return assignedAISystem;
    }

    public void setAssignedAISystem(AISystems assignedAISystem) {
        this.assignedAISystem = assignedAISystem;
    }

}
