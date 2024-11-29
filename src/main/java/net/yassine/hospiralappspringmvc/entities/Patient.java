package net.yassine.hospiralappspringmvc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name="PATIENTS")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private int score;
    private boolean malade;
}
