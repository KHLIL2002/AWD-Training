package esprit.job;

import jakarta.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String description;
    private String etat; // "oui" ou "non"

    public Job() {}

    public Job(String nom, String description, String etat) {
        this.nom = nom;
        this.description = description;
        this.etat = etat;
    }

    // getters & setters
}
