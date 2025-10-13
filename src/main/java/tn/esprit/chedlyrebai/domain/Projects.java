package tn.esprit.chedlyrebai.domain;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Projects {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    private String libelle;
    private LocalDate startDate;
    private LocalDate endDate;

    @OneToOne(mappedBy = "project", cascade = CascadeType.ALL)
    private ProjectDetails projectDetails;

    @ManyToMany(mappedBy = "projects")
    private Set<Agent> agents;
}
    