package be.bstorm.exoStream;

import java.time.LocalDate;

public class Occupation {

    private static int COUNT;
    private int id;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;
    private int nbOccupants;

    public Occupation(LocalDate dateArrivee, LocalDate dateDepart, int nbOccupants) {
        this.id = COUNT++;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.nbOccupants = nbOccupants;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public int getNbOccupants() {
        return nbOccupants;
    }
}
