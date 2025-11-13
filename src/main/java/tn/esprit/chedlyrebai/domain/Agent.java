package tn.esprit.chedlyrebai.domain;

import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentId;

    private String name;
    private boolean available;

    
    @ElementCollection(targetClass = Skills.class)
    @Enumerated(EnumType.STRING)
    private Set<Skills> skills;

    @OneToMany(mappedBy = "assignedAgent")
    private Set<Calls> calls;

    @ManyToMany
    @JoinTable(
        name = "agent_project",
        joinColumns = @JoinColumn(name = "agent_id"),
        inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Projects> projects;

}
