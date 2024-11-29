package net.yassine.hospiralappspringmvc.entities;

import lombok.*;

import java.util.Date;

/**
 * @author $ {USER}
 **/
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Patient {
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private int score;
    private boolean malade;
}
