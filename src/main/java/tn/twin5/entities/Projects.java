package tn.twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

import org.aspectj.weaver.loadtime.Agent;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    private String libelle;
    LocalDate startDate;
    LocalDate endDate;

    @OneToOne
    ProjectDetails detail;

    @ManyToMany
    Set<Agents> agents;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private ProjectDetails projectDetails;

    


}
