package be.bstorm.exoStream;

import java.awt.*;

public class Emplacement {
    private int numero;
    private TypeEmplacement typeEmplacement;
    private Taille taille;
    private Occupation occupation;
    private double prixTotal;
    private boolean estOccupee;

    public int getNumero() {
        return numero;
    }

    public TypeEmplacement getTypeEmplacement() {
        return typeEmplacement;
    }

    public Taille getTaille() {
        return taille;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public boolean isEstOccupee() {
        return estOccupee;
    }
}
