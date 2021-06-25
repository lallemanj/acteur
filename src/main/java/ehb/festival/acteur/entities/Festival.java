package ehb.festival.acteur.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String naam;
    private String datum;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "acteur_id")
    private Acteur acteur;

    public Festival() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }
}
