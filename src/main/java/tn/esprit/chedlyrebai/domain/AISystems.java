
package tn.esprit.chedlyrebai.domain;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.Set;
@Entity
@Data
public class AISystems{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aiSystemId;

    private String type;
    private boolean available;

    @ElementCollection(targetClass = Skills.class)
    @Enumerated(EnumType.STRING)
    private Set<Skills> skills;

    @OneToMany(mappedBy = "assignedAISystem")
    private Set<Calls> calls;
   
}