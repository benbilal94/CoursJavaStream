package be.bstorm.exoStream;

import java.time.LocalDate;

public class Occupation {

    private int id;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;
    private int nbOccupants;

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
