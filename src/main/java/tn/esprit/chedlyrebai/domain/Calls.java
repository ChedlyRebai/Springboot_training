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
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
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

   

}
